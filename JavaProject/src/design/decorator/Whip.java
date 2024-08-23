package design.decorator;

public class Whip implements Decorator {
	  private Coffee coffee;

	    public Whip(Coffee coffee) {
	        this.coffee = coffee;
	    }

	@Override
	public String getDescription() {
		 return coffee.getDescription() + " with Whip";
	}

	@Override
	public double getCost() {
		return coffee.getCost() + 1.0;
	}

}
