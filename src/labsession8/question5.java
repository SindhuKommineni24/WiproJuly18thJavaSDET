//Write a program to check if two LinkedLists are equal.

package labsession8;
import java.util.*;

public class question5{
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>();
        l1.add("arun");
        l1.add("binathi");
        l1.add("Chaitu");
        LinkedList<String> l2 = new LinkedList<>();
        l1.add("arun");
        l1.add("binathi");
        l1.add("Chaitu");

        if (l1.equals(l2)) {
            System.out.println("LinkedLists are equal");
        } else {
            System.out.println("LinkedLists are not equal");
        }
    }
}
