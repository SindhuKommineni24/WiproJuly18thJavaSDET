package corejava;

public class SingleInChildClass extends SingleInSuperClass {
	String model="Mustang";
	public void display() {
		System.out.println("brand is "+brand);//inherited
		System.out.println("model is "+model);
	}
	public static void main(String[] args) {
		SingleInChildClass obj=new SingleInChildClass();
		obj.start();//inherited method
		obj.display();//own method
	}

}
