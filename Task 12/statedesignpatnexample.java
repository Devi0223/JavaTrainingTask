package statedesignpattern;

interface TrafficState {
    void SigOn(TrafficSignal signal);
    void SigOff(TrafficSignal signal);
}

class TrafficSignal {
    private TrafficState state;
    
    public TrafficSignal() {
        state = new SigOfState();
    }
    
    public void settrafficState(TrafficState state) {
        this.state = state;
    }
    
    public void SigOn() {
        state.SigOn(this);
    }
    
    public void SigOff() {
        state.SigOff(this);
    }
}

class SignalOnState implements TrafficState {
    @Override
    public void SigOn(TrafficSignal signal) {
        System.out.println("Red Light On");
    }
    
    @Override
    public void SigOff(TrafficSignal signal) {
        System.out.println("Green Light On");
        signal.settrafficState(new SigOfState());
    }
}

class SigOfState implements TrafficState {
    @Override
    public void SigOn(TrafficSignal signal) {
        System.out.println("Red Signal On");
        signal.settrafficState(new SignalOnState());
    }
    
    @Override
    public void SigOff(TrafficSignal signal) {
        System.out.println("Red Signal is already off");
    }
}

public class statedesignpatnexample {
    public static void main(String[] args) {	
    	TrafficSignal signal = new TrafficSignal();
        signal.SigOn();
        signal.SigOff();
        signal.SigOff();
        signal.SigOn();
        signal.SigOff();
    }
}
