package corejava;

public class StringBuilderEg {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

       //reverse
        sb.reverse();
        System.out.println(sb);
        sb.reverse(); 

        // insert()
        sb.insert(5, " World");
        System.out.println(sb);  // Hello World

        // delete()
        sb.delete(5, 11); // delete " World"
        System.out.println(sb); // Hello

        // substring()
        String sub = sb.substring(1, 4);
        System.out.println(sub); // ell

        // replace()
        sb.replace(0, 2, "He");
        System.out.println(sb); // Hello

        // charAt(index)
        char ch = sb.charAt(1);
        System.out.println(ch); // e

        // indexOf()
        int index = sb.indexOf("l");
        System.out.println(index); // 2

        // length()
        int len = sb.length();
        System.out.println(len); // 5

        // 9. repeat() - available only in String, so convert
        String repeated = sb.toString().repeat(3);
        System.out.println(repeated);

        // 10. isEmpty() - not in StringBuilder
        System.out.println((sb.length() == 0)); // false
    }
}
