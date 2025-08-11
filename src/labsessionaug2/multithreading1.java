package labsessionaug2;

public class multithreading1 implements Runnable {
	public void run() {
		System.out.println("Thread is running");
		System.out.println("Thread "+Thread.currentThread().getId()+" is running");
	}

}
