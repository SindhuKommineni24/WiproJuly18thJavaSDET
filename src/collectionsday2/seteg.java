package collectionsday2;

import java.util.Set;
import java.util.TreeSet;

public class seteg {
	//treeset example
	//contains no duplicate elemnts
	//at most one null element
	//non synchronized
	//data is displayed in ascending order
	//operations are faster then list 
	public static void main(String[] args) {
	Set<String> s=new TreeSet<>();
	s.add("orange");
	s.add("banana");
	s.add("Graphes");
	s.add("apple");
	s.add("pineapple");
	s.add("graphes");
	s.add("null");
	s.add("null");
	System.out.println(s);
	s.remove("pineapple");
	System.out.println(s);
	System.out.println(s.isEmpty());
	System.out.println(s.size());
	
	}
}
