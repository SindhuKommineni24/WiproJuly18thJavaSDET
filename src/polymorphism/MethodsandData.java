package polymorphism;

public class MethodsandData {
	//class variables and instance variables
	public String  employeeName="Peter";
	int employeeid=3456;
	public static String employeeBU="HR";
	public void fetchemployeedetails() {
		//Local variables
		System.out.println(employeeName);
		System.out.println(employeeid);
		System.out.println(employeeBU);	
	}
	public static void main(String[] args) {
		MethodsandData obj=new MethodsandData();
		obj.fetchemployeedetails();
	}
}
