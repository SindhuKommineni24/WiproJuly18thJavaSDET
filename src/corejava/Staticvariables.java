package corejava;

public class Staticvariables {
	//variables declared at class level with static keyword
	public static String studentname="sindhu";
	public String studentaddress="Hyderabad";
	public static int studentid=456;
	
	public static void main(String[] args) {
		Staticvariables obj=new Staticvariables();
		System.out.println(studentname);
		System.out.println(obj.studentaddress);
		System.out.println(studentname);
		
	}
}
