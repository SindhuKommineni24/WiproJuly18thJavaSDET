package corejava;

public class ParameterizedMethod {
	
	//normal method with hard coded data
	public void add() {
		int a=9;
		int b=8;
		int c=a+b;
		System.out.println(c);
	}
	
	//parameterised data
	public void add1(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	
	//method returning a int value
	public int add2(int a,int b) {
		int c=a+b;
		return c;
	}
	
	public static void main(String[] args) {
		ParameterizedMethod obj=new ParameterizedMethod();
		
		obj.add1(23,4);
		obj.add1(6, 5);
		obj.add1(5, 8);
	
	}

}
