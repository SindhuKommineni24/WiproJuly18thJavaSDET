package collections;

import java.util.ArrayList;

public class Arraylisteg {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList();
		
		//insertion of data
		al.add("sindhu");
		al.add("akhila");
		al.add("harsha");
		al.add("aruna");
		al.add("sravani");
		
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(al.indexOf("harsha"));
		System.out.println(al.isEmpty());
		System.out.println(al.remove(4));
		System.out.println(al);
		System.out.println(al.set(3,"king"));
		System.out.println(al);
		System.out.println(al.size());
		
	}

}
