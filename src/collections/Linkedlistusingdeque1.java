package collections;

import java.util.Deque;
import java.util.LinkedList;

public class Linkedlistusingdeque1 {
    public static void main(String[] args) {
        Deque<String> lang = new LinkedList<>();
        
        // Insertion at the tail (like normal queue)
        lang.addLast("python");
        lang.addLast("java");
        lang.addLast("c");
        lang.addLast("c++");
        lang.addLast("database");
        
        System.out.println(lang);                     
        System.out.println(lang.peekFirst());         
        System.out.println(lang.remove("c"));         
        System.out.println(lang);                  
        System.out.println(lang.pollFirst());         
    }
}
