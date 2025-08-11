package Package2;
import Package1.class1;
public class DiffPackNonSubClass {
	public void print() {
		System.out.println("printing the data");
	}
	
	public static void main(String[] args) {
		DiffPackNonSubClass obj=new DiffPackNonSubClass();
		obj.print();//own method
		
		class1 obj1=new class1();
		obj1.display();//inherited method
		
	
		
	}

}
