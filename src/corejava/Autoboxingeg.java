package corejava;

public class Autoboxingeg {
    public static void main(String[] args) {
        // Autoboxing: converting primitive int to Integer object
        int a = 78;
        Integer i = Integer.valueOf(a); // explicit autoboxing
        System.out.println("Autoboxed Integer: " + i);
        
        // Unboxing: converting Integer object to primitive int
        Integer a1 = new Integer(3);
        int i1 = a1.intValue(); // manual unboxing
        int j = a1;             // auto-unboxing
        System.out.println("Manually Unboxed int: " + i1);
        System.out.println("Auto-unboxed int: " + j);
    }
}
