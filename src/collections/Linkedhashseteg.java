package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class Linkedhashseteg {
    public static void main(String[] args) {
        // no duplicates are allowed
        // maintains insertion order
        // only one null is allowed
        // not synchronized
        // slightly slower than HashSet (due to order maintenance)
        Set<String> items = new LinkedHashSet<>();
        items.add("Pen");
        items.add("Book");
        items.add("Pencil");
        items.add("Notebook");
        items.add("Eraser");
        items.add("Book");    
        items.add(null);      
        items.add(null);      
        System.out.println(items);
        items.remove("Pencil");
        System.out.println( items);
        System.out.println( items.contains("Pen"));
        System.out.println(items.size());
        System.out.println( items.isEmpty());
    }
}
