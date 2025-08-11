package collections;
import java.util.HashSet;
import java.util.Set;
public class Hashseteg {
    // HashSet example
    // Unordered collection (no insertion or sorting order)
    // No duplicate elements allowed
    // Allows one null element
    // Not synchronized (not thread-safe)
	//multiple null values are allowed

    public static void main(String[] args) {
        Set<String> f = new HashSet<>();
        f.add("Apple");
        f.add("Banana");
        f.add("Mango");
        f.add("Orange");
        f.add("Grapes");
        f.add("Banana"); 
        f.add(null);     
        System.out.println(f);
        f.remove("Mango");
        System.out.println(f);
        System.out.println(f.isEmpty());
        System.out.println(f.size());
        System.out.println(f.contains("Apple"));
    }
}
