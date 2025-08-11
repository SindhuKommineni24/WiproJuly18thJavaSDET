package labsessionaug2;

public class UseSyncClass {
	public static void main(String[] args) throws InterruptedException{
		ThreadSync cnt=new ThreadSync();
		//thread 1 to increment the counter
		Thread t1=new Thread(() -> {
			for(int i=0;i<1000;i++) {
				cnt.inc();
			}
		});
		//thread2 to increment the counter
		Thread t2=new Thread(() -> {
			for(int i=0;i<1000;i++) {
				cnt.inc();
			}
		});
		
		//start both the threads
		
		t1.start();
		t2.start();
		
		//wait for the threads to finish
		t1.join();
		t2.join();
		
		//print the final counter value
		System.out.println("Counter "+cnt.get());
	}

}
