package labsession9;
import java.util.*;
public class ExpandString {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        String input = sc.next();
        String output = "";
        for (int i = 0; i < input.length(); i += 2) {
            char ch = input.charAt(i);              
            int count = input.charAt(i + 1) - '0';  
            for (int j = 0; j < count; j++) {
                output += ch;  
            }
        }
        System.out.println(output);
    }
}
