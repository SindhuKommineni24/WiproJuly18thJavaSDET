/*Create an abstract class Vehicle with abstract method move().
Subclasses:
Car, Bike, Bus
Each subclass should override move() with specific output like:
Car is moving on four wheels
Bike is moving on two wheels
 */

package labsession3;

abstract class Vehicle {
	abstract void move();
}

class Car extends Vehicle {
	void move() {
		System.out.println("Car is moving on four wheels");
	}
}

class Bike extends Vehicle {
	void move() {
		System.out.println("Bike is moving on two wheels");
	}
}

class Bus extends Vehicle {
	void move() {
		System.out.println("Bus is moving on six wheels");
	}
}

public class Abstraction4 {
	public static void main(String[] args) {
		Vehicle car = new Car();
		Vehicle bike = new Bike();
		Vehicle bus = new Bus();

		car.move();
		bike.move();
		bus.move();
	}
}

