package corejava;

public class Encapsulationeg {
	//private fields - hidden from outside access
	private String name;
	private int age;
	
	//public getter method for name
	public String getName() {
		return name;
	}
	
	//public setter method for name
	public void setName(String name) {
		this.name=name;
	}
	
	//public getter method for age
	public int getage() {
		return age;
	}
	
	//public setter method for age
	public void setage(int age) {
		this.age=age;
	}
	
	public static void main(String[] args) {
		Encapsulationeg obj=new Encapsulationeg();
		obj.setName("sindhu");
		obj.setage(22);
		System.out.println(obj.getName());
		System.out.println(obj.getage());
		
	}

}
