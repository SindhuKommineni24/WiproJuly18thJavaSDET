package polymorphism;

public class MethodsandData1 {
	//class variables and instance variables
		public String  StudentName="Peter";
		int Studentid=3456;
		public static String Studentloc="Hyd";
		public void fetchemployeedetails() {
			//Local variables
			int Studentrank=23;
			System.out.println(StudentName);
			System.out.println(Studentid);
			System.out.println(Studentloc);	
		}
		public static void main(String[] args) {
			MethodsandData1 obj=new MethodsandData1();
			obj.fetchemployeedetails();
		}
}