package corejava;

abstract class AbstractClassEg extends Operators {
	
	//abstract methods
	abstract void makesound();
	
	//concrete methods
	public void eat() {
		System.out.println("The animal eats food");
	}
	
	//constructor
	AbstractClassEg(){
		System.out.println("creating constructor in abstract class");
	}
	
	//instance variables
	public static String animalName="Lion";
	
	//final variable
	private final String animalBehaviour="roars";
	
	
	
}
