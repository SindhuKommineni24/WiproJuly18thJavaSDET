package collectionsday2;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class vectoreg {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Banana");
        vector.add("Apple");
        vector.add("Cherry");
        vector.add("Date");
        vector.add("Fig");
        vector.add("Elderberry");

        System.out.println(vector);
        System.out.println(vector.size());
        System.out.println(vector.capacity());
        System.out.println(vector.elementAt(3));
        System.out.println(vector.contains("Apple"));
        System.out.println(vector.indexOf("Cherry"));
        vector.add("Apple");
        System.out.println(vector.lastIndexOf("Apple"));
        System.out.println(vector.get(2));
        vector.set(2, "Blueberry");
        System.out.println(vector);
        vector.remove("Date");
        vector.remove(1);
        System.out.println(vector);
        System.out.println(vector.subList(0, 2));
    }
}
