package abstractdesignpattern;

//Employee class hierarchy
abstract class Pizza {
	protected String name;
	protected double cost;

	public Pizza(String name, double cost) {
		this.name = name;
		this.cost = cost;
	}

	public abstract void pizzaprice();
}

class BbqChickenPizza extends Pizza {
	public BbqChickenPizza(String name, double cost) {
		super(name, cost);
	}

	public void pizzaprice() {
		System.out.println("Price of BBQ Chicken Pizza is " + cost);
	}
}

class PepperoniPizza extends Pizza {
	public PepperoniPizza(String name, double cost) {
		super(name, cost);
	}

	public void pizzaprice() {
		System.out.println("Price of Pepperoni Pizza is " + cost);
	}
}

//Abstract factory interface
interface PizzaFactory {
	public Pizza createPizza(String name, double cost);
}

//Concrete factory classes
class BbqChickenPizzaFactory implements PizzaFactory {
	public Pizza createPizza(String name, double cost) {
		return new BbqChickenPizza(name, cost);
	}
}

class PepperoniPizzaFactory implements PizzaFactory {
	public Pizza createPizza(String name, double cost) {
		return new PepperoniPizza(name, cost);
	}
}

//Client class
class PizzaCost {
	private PizzaFactory factory;

	public PizzaCost(PizzaFactory factory) {
		this.factory = factory;
	}

	public void pizzaprice(String name, double cost) {
		Pizza pizza = factory.createPizza(name, cost);
		pizza.pizzaprice();
	}
}

//Example usage
public class absdesigpattrn {
	public static void main(String[] args) {
		PizzaFactory BbqChickenPizzafactory = new BbqChickenPizzaFactory();
		PizzaFactory pepperonipizzafactory = new PepperoniPizzaFactory();

		PizzaCost bbqchickenpizzaprice = new PizzaCost(BbqChickenPizzafactory);
		bbqchickenpizzaprice.pizzaprice("BBQ Chicken ", 800.0);

		PizzaCost pepperonipizzaprice = new PizzaCost(pepperonipizzafactory);
		pepperonipizzaprice.pizzaprice("Pepperoni pizza", 900.0);
	}
}
