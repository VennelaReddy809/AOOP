package design.decorator;

public class Sugar implements Decorator {
	 private Coffee coffee;

	    public Sugar(Coffee coffee) {
	        this.coffee = coffee;
	    }


	@Override
	public String getDescription() {
		 return coffee.getDescription() + " with Sugar";
	}

	@Override
	public double getCost() {
		 return coffee.getCost() + 0.2;
	}

}
