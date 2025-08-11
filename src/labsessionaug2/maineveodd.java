package labsessionaug2;
public class maineveodd {
	
    public static void main(String[] args) {
    	
    	eventhread even = new eventhread();
    	
    	oddthread odd = new oddthread();

        even.start();
        
        odd.start();
   }
}
