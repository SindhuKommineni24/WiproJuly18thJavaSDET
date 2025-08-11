package Package1;
import company.Employee;
public class SamePackNonSubClass {
	public void write() {
		System.out.println("writing in subclass");
	}
	public static void main(String[] args) {
		class1 obj=new class1();
		obj.display();//inherited
		obj.fetchemployeeId();
		obj.fetchemployeeName();
		SamePackNonSubClass obj1=new SamePackNonSubClass();
		obj1.write();//own method 
		
		Employee obj2=new Employee();
		obj2.showDetails();  
		
		
	}
}
