package design.decorator;

public class CoffeeDecoratorApp {
	 public static void main(String[] args) {
	        Coffee coffee = new Coffee();

	        System.out.println(coffee.getDescription() + ", Cost: $" + coffee.getCost()); // Output: Coffee, Cost: $5.0

	        Milk milkCoffee = new Milk(coffee);
	        System.out.println(milkCoffee.getDescription() + ", Cost: $" + milkCoffee.getCost()); // Output: Coffee with Milk, Cost: $5.5

	        Sugar sugarMilkCoffee = new Sugar(coffee);
	        System.out.println(sugarMilkCoffee.getDescription() + ", Cost: $" + sugarMilkCoffee.getCost()); // Output: Coffee with Milk and Sugar, Cost: $5.7

	         Whip whipSugarMilkCoffee = new Whip(coffee);
	        System.out.println(whipSugarMilkCoffee.getDescription() + ", Cost: $" + whipSugarMilkCoffee.getCost()); // Output: Coffee with Milk, Sugar, and Whip, Cost: $6.7
	    }
	}

