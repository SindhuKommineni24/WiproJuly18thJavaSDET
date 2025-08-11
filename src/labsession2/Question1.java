/*Write a Java program to create a class called Animal 
 * with a method called makeSound(). Create a 
 * subclass called Cat that overrides the makeSound() 
 * method to bark.
 */
package labsession2;

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Bark");  
    }
}
public class Question1 {
	public static void main(String[] args) {
        Animal obj = new Animal();  
        obj.makeSound();            

        Cat obj1 = new Cat();        
        obj1.makeSound();  
	}
}
