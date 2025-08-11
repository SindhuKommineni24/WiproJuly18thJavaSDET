package collectionsday2;

import java.util.Map;
import java.util.TreeMap;

public class Treemapeg {
    public static void main(String[] args) {
        // TreeMap stores key-value pairs sorted by key (ascending)
        // Does NOT allow null keys (throws NullPointerException)
        // Allows null values
        // Duplicate keys are not allowed (existing value gets replaced)
        //  Duplicate values are allowed

        Map<Integer, String> map = new TreeMap<>();

        map.put(1, "Sindhu");   
        map.put(2, "Akhila");   
        map.put(3, "Aruna");    
        map.put(2, "Akhil");    
        map.put(4, "Aruna");  
        map.put(5, null);       

        // map.put(null, "test"); // NullPointerException
        // map.put(null, null);   // NullPointerException

        System.out.println("TreeMap contents (sorted by keys):");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
