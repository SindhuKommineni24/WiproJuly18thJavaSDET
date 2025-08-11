/*Write a Java program to create an interface Shape
 *  with the getArea() method. Create three classes Rectangle, 
 *  Circle, and Triangle that implement the Shape interface. 
 *  Implement the getArea() method for each of the three
 *   classes.
 */



package labsession4;
interface Shape {
	double getArea();
}

class Rectangle implements Shape {
	double length, width;
	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public double getArea() {
		return length * width;
	}
}

class Circle implements Shape {
	double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}
}

class Triangle implements Shape {
	double base, height;

	Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public double getArea() {
		return 0.5 * base * height;
	}
}


public class Interface1 {
	public static void main(String[] args) {
		Shape r = new Rectangle(5, 3);
		System.out.println("Area of Rectangle " + r.getArea());
		Shape c= new Circle(4);
		System.out.println("Area of circle " + c.getArea());
		Shape t= new Triangle(6, 2);
		System.out.println("Area of Triangle " + t.getArea());
	}
}

