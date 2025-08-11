package labsessionaug2;
class SumThread extends Thread {
	
    int s1, e1;
    
    int sum = 0;

    SumThread(int start, int end) {
    	
        this.s1 = start;
        
        this.e1 = end;
    }

    public void run() {
        for (int i = s1; i <= e1; i++) {
        	
            if (isPrime(i)) {
            	
                sum += i;
            }
        }
        
        System.out.println("Sum of prime numbers " + s1 + " to " + e1 + " is " + sum);
    }
    boolean isPrime(int no) {
    	
        if (no < 2) return false;
        
        for (int i = 2; i * i <= no; i++) {
        	
            if (no % i == 0) return false;
        }
        return true;
    }
}