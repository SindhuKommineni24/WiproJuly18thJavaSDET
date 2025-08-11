//Write a program to find the second-largest element in an ArrayList of Integers.
package labsession8;
import java.util.*;
public class question4 {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(23);
        l.add(89);
        l.add(12);
        l.add(56);
        l.add(89);
        l.add(34);
        
        Set<Integer> unique = new TreeSet<>(l);
        ArrayList<Integer> sortedList = new ArrayList<>(unique);
        
        if (sortedList.size() < 2) {
            System.out.println("No second largest element");
        } else {
            System.out.println(sortedList.get(sortedList.size() - 2));
        }
    }
}

