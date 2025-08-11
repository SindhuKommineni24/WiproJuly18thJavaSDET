package polymorphism;



public class MethodOverlaodings {
	
	//method add with 2 parameters
	public int add(int a,int b) {
		int c=a+b;
		return c;
	}
	//method add with 3 parameters
	public int add(int a,int b,int c) {
		int d=a+b+c;
		return d;
	}
	//method add with 4 parameters
	public int add(int a,int b,int c,int d) {
		int e=a+b+c+d;
		return e;
	}
	
	public double add(double a,double b) {
		return a+b;
	}
	
	public double add(double a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		MethodOverlaodings obj=new MethodOverlaodings();
		System.out.println(obj.add(1,2));
		System.out.println(obj.add(1,2,3));
		System.out.println(obj.add(1,2,3,4));
		System.out.println(obj.add(10,20));
		System.out.println(obj.add(10,30));
	}
}
