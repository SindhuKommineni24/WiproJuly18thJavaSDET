package corejava;

public class StaticInOtherclass {
	
	public static void main(String[] args) {
		
		System.out.println(Staticvariables.studentname);
		System.out.println(Staticvariables.studentid);
		Staticvariables sv=new Staticvariables();
		System.out.println(sv.studentaddress);
	}

}
