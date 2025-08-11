package labsessionaug2;

import java.util.Arrays;

public class intarray {

	    public static void main(String[] args) {
	    	
	        int[] array = {25, 38, 45, 70, 10, 20};

	        int mid = array.length / 2;

	        IntThread t1 = new IntThread(array, 0, mid);
	        
	        IntThread t2 = new IntThread(array, mid, array.length);

	        t1.start();
	        
	        t2.start();
	        
	        System.out.println(" Array " + Arrays.toString(array));

	    }
	}