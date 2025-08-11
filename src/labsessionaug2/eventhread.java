package labsessionaug2;

class eventhread extends Thread {
	
    public void run() {
    	
        for (int i = 1; i <= 20; i += 2) {
        	
            System.out.println("Even " + i);
        }
    }
}

class oddthread extends Thread {

    public void run() {
    	
        for (int i = 1; i <= 10; i += 2) {
        	
            System.out.println("Odd " + i);
        }
    }
}