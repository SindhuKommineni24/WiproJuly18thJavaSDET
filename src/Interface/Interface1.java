package Interface;

public interface Interface1{
	
	//abstract methods
	abstract void display();
	
	static void write() {
		System.out.println("Writing in interface");
	}
	
	default void read() {
		System.out.println("reading in interface");
	}
	
	public static final String employeeName="sindhu";
	
	int employeeid= 423;
	
	
}
