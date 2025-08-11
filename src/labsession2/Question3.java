/*Write a Java program to create a class called Shape 
 * with a method called getArea(). Create a subclass 
 * called Rectangle that overrides the getArea() method 
 * to calculate the area of a rectangle.
 */
package labsession2;

class Shape {
    public double getArea() {
        return 0; 
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }
}

public class Question3 {
	public static void main(String[] args) {
        Shape obj = new Shape();
        System.out.println(obj.getArea());
        Rectangle obj1= new Rectangle(5.0, 3.0);
        System.out.println(obj1.getArea());
    }
}
