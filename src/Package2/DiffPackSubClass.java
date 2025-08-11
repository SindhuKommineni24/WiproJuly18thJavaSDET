package Package2;
import Package1.class1;


public class DiffPackSubClass extends class1{
	
	
	public void create() {
		System.out.println("creating the subclass");
	}
	
	public static void main(String[] args) {
		DiffPackSubClass obj1=new DiffPackSubClass();
		obj1.create();//own method
		obj1.display();//inherited method
		obj1.fetchemployeeName();
		
	}

}
