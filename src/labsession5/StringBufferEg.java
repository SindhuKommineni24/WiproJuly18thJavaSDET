package labsession5;

public class StringBufferEg {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hello");
		//mutable in nature
		//append
		sb.append("world");
		System.out.println(sb);
		
		//string buffer methods
		//reverse, isEmpty,insert,delete,substring,replace,char at index,indexOf , length,repeat
		
		// reverse()
        
        sb.reverse();
        System.out.println(sb);
        sb.reverse(); 

        // insert()
        sb.insert(5, " World");
        System.out.println( sb);  // Hello World

        // delete()
        sb.delete(5, 11); 
        System.out.println( sb); // Hello

        // substring()
        String sub = sb.substring(1, 4);
        System.out.println(sub); // ell

        // replace()
        sb.replace(0, 2, "He");
        System.out.println(sb); // Hello

        // charAt(index)
        char ch = sb.charAt(1);
        System.out.println( ch); // e

        // indexOf()
        int index = sb.indexOf("l");
        System.out.println(index); // 2

        // length()
        int len = sb.length();
        System.out.println(len); // 5

        //repeat() 
        String repeated = sb.toString().repeat(3);
        System.out.println(repeated);

        // isEmpty() - not available in StringBuffer directly
        System.out.println("Is Empty: " + (sb.length() == 0)); // false
    }
}
		
	
