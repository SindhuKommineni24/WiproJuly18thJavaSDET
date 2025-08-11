package Package1;

public class class1 {
	
	//private variable
	private static String employeeSalary="35000";
	
	//private method
	private void fetchSalary() {
		System.out.println("The employee salary is "+employeeSalary);
	}
	
	public void display() {
		System.out.println("displaying the data");
	}
	
	//default variable
	int employeeId=567;
	
	//default method
	void fetchemployeeId() {
		System.out.println("The employee ID is "+employeeId);
	}
	
	//protected variable
	protected String employeeName="sindhu";
	
	//protected method
	protected void fetchemployeeName() {
		System.out.println("employee Name is "+employeeName);
	}
	
	public static void main(String[] args) {
		class1 obj=new class1();
		obj.display();
		obj.fetchSalary();
		obj.fetchemployeeId();
		obj.fetchemployeeName();
	}

}
