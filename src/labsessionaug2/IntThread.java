package labsessionaug2;
import java.util.Arrays;

class IntThread extends Thread {
	
    int[] array;
    
    int s1, e1;

    IntThread(int[] array, int start, int end) {
    	
        this.array = array;
        
        this.s1 = start;
        
        this.e1 = end;
    }

    public void run() {
    	
        Arrays.sort(array, s1, e1);
                
        System.out.println("Sorted Array " + Arrays.toString(Arrays.copyOfRange(array, s1, e1)));
    }
}