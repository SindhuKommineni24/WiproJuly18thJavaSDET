package collectionsday2;

import java.util.Set;
import java.util.TreeSet;

public class treeseteg {
	//treeset example
	//contains no duplicate elemnts
	//at most one null element
	//non synchronized
	//data is displayed in ascending order
	//operations are faster then list 
	public static void main(String[] args) {
	Set<Integer> s=new TreeSet<>();
	s.add(49);
	s.add(78);
	s.add(89);
	s.add(80);
	s.add(10);
	s.add(99);
	s.add(23);
	s.add(74);
	System.out.println(s);
	s.remove(89);
	System.out.println(s);
	System.out.println(s.isEmpty());
	System.out.println(s.size());
	
	}
}