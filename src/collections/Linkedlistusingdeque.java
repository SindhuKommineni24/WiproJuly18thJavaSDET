package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Linkedlistusingdeque {
	public static void main(String[] args) {
		Queue<String> lang=new LinkedList<>();
		lang.add("python");
		lang.add("java");
		lang.add("c");
		lang.add("c++");
		lang.add("database");
		System.out.println(lang);
		System.out.println(lang.peek());
		System.out.println(lang.remove("c"));
		System.out.println(lang);
		System.out.println(lang.poll());
		
	}
}
