package EmployeeStrategyDesPatten;


public class Hikedetails {

	private String salarydescription;
	private int allotedamount;
	
	public Hikedetails(String component, int sal){
		this.salarydescription=component;
		this.allotedamount=sal;
	}

	public int getPrice() {
		return allotedamount;
	}
	
}
