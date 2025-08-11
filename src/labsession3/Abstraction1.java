/*Define an abstract class Shape with an 
 * abstract method calculateArea().
Create subclasses:
 
Circle (with radius)
 
Rectangle (with length and width)
 
Print area of each.*/

package labsession3;

abstract class Shape {
	abstract double calculateArea(); 
}


class Circle extends Shape {
	double r = 7; 

	double calculateArea() {
		return Math.PI * r * r;
	}
}


class Rectangle extends Shape {
	double length = 5;  
	double width = 3;   
	double calculateArea() {
		return length * width;
	}
}

public class Abstraction1 {
	public static void main(String[] args) {
		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();

		System.out.println("Area of Circle: " + circle.calculateArea());
		System.out.println("Area of Rectangle: " + rectangle.calculateArea());
 }
}
