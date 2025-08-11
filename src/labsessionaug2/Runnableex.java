package labsessionaug2;

public class Runnableex {
	public static void main(String[] args) {
		int n=10;
		for(int i=0;i<n;i++) {
			Thread obj=new Thread(new multithreading1());
			obj.start();
		}
	}

}
