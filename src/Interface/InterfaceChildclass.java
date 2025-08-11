package Interface;

public class InterfaceChildclass implements Interface1 {
	public void display() {
		System.out.println("Displaying in child class");
	}
	
	public static void main(String[] args) {
		InterfaceChildclass obj=new InterfaceChildclass();
		
		obj.display();
		Interface1.write();
		obj.read();
		System.out.println(employeeName);
		System.out.println(employeeid);
		
		
		
	}
}

