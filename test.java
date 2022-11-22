public class test {

	public static void main(String[] args) {

		Car car1 = new Car("Fiat", "500", 50);

		car1.printData();

		car1.accelerate();
		car1.accelerate();
		car1.accelerate();
		car1.accelerate();

		car1.brake();

		car1.printData();

		Car car2 = new Car("Toyota", "RAV4", 40);

		car2.printData();

	}

}

class Car {

	private String brand;

	private String model;

	private int amountOfFuel;

	public Car() {

		brand = "";

		model = "";

		amountOfFuel = 0;

		printData();

	}

	public Car(String brand1, String model1, int amount) {

		brand = brand1;

		model = model1;

		amountOfFuel = amount;

	}

	public String getModel() {

		return model;

	}

	public void setModel(String getmodel) {

		model = getmodel;

	}

	public void refuel(int amount) {

		System.out.println("Fuel in the tank: " + amountOfFuel);

		System.out.println("Refuel: " + amount);

		System.out.println("Fuel in the tank after the refuel: " + (amount + amountOfFuel));

	}

	public void brake() {

		System.out.println("Car is breaking");

	}

	public void accelerate() {

		if (amountOfFuel > 0) {

			System.out.println("Car is accelerating");

			amountOfFuel = amountOfFuel - 1;

		}

	}

	public void printData() {

		System.out.println("Brand: " + brand);

		System.out.println("Model: " + model);

		System.out.println("Fuel: " + amountOfFuel);

	}

}