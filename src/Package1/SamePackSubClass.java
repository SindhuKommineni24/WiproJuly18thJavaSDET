package Package1;

public class SamePackSubClass extends class1 {
	public void read() {
		System.out.println("reading in subclass");
	}
	public static void main(String[] args) {
		SamePackSubClass obj=new SamePackSubClass();
		obj.display(); //inherited
		obj.read();//own method
		obj.fetchemployeeId();
		obj.fetchemployeeName();
		
		
		
	}

}
