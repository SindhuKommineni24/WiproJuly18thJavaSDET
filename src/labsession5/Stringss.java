package labsession5;

public class Stringss {
	public static void main(String[] args) {
		//strings
		//immutable cannot be changed
		//zero based index
		//sequence of characters stored
		String s1="hello world";
		System.out.println(s1);
		char ch[]= {'h','e','l','l','o'};
		String s2=new String(ch);
		System.out.println(s2);
		
		String s3=new String("hello");
		System.out.println(s3);
		
		//string methods
		
		String str1="Hyderabad";
		String str2="Delhi";
		//equals
		System.out.println(str1.equals(str2)); //false
		System.out.println(str1.equalsIgnoreCase(str2)); //false
		
		//concatenation
		System.out.println(str1.concat(str2)); //HyderabadDelhi
		
		//contains
		System.out.println(str1.contains("r")); //true
		
		//substring
		System.out.println(str1.substring(3)); //erabad
		System.out.println(str1.substring(1,3)); //yd
		
		//replace
		System.out.println(str1.replace("a","s")); //Hydersbsd
		System.out.println(str1.replaceAll(str1,"Telangana")); //Telangana
		
		//isempty
		System.out.println(str1.isEmpty()); //false
		
		//ends with
		System.out.println(str1.endsWith("d")); //true
		
		//join
		String str3=String.join("-","city","Mumbai");//city-Mumbai
		System.out.println(str3);
		
		//compare to lexo graphical comparision
		System.out.println(str2.compareTo(str3));//-31
		
		
		//split
		String str4="java is a programming language";
		String res[]=str4.split(" ");
		for(String str:res) {
			System.out.println(str);
		}
			
				 
	}

}

