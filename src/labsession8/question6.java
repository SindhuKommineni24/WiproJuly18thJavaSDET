//.Write a program to find the maximum element from an ArrayList of Integers.
package labsession8;
import java.util.*;
public class question6 {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(45);
        l.add(78);
        l.add(23);
        l.add(90);
        l.add(12);
        int max = Collections.max(l);
        System.out.println( max);
    }
}

