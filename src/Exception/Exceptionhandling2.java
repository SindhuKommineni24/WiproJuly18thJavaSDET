package Exception;

public class Exceptionhandling2 {
	
	public static void checkage(int age) throws Exception{
		if(age<18) {
			System.out.println("create a new exception");
			Thread.sleep(1000);
			throw new Exception("Age must be 18 or older to vote");
		}else {
			System.out.println("person is not eligible for voting");
		}
	}
	public static void main(String[] args) {
		
	}

}