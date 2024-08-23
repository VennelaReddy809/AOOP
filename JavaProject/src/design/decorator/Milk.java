package design.decorator;

public class Milk implements Decorator {
	private Coffee coffee;
	public Milk(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public String getDescription() {
		return coffee.getDescription()+"with Milk";
	}

	@Override
	public double getCost() {
		return coffee.getCost() + 0.5;
	}

}
