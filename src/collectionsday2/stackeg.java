package collectionsday2;

import java.util.Collections;
import java.util.Stack;
public class stackeg {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("sindhu");
        stack.push("chowdary");
        stack.push("akhila");
        stack.push("swaraj");
        stack.push("dinesh");
        stack.push("sravani");
        System.out.println(stack);                      
        System.out.println(stack.size());              
        System.out.println(stack.capacity());           
        System.out.println(stack.elementAt(3));         
        System.out.println(stack.contains("dinesh"));    
        System.out.println(stack.indexOf("akhila"));   
        stack.push("dinesh");                          
        System.out.println(stack.lastIndexOf("dinesh"));
        System.out.println(stack.get(2));               
        stack.set(2, "udaysri");                      
        System.out.println(stack);                      
        stack.remove("sravani");
        stack.remove(1);
        System.out.println(stack);                 
        System.out.println(stack.subList(0, 2));         
        System.out.println(stack.peek());   
        System.out.println(stack.pop());        
        System.out.println(stack);
        Collections.sort(stack);
        System.out.println(stack);
        Collections.reverse(stack);
        System.out.println(stack);
        System.out.println(stack.isEmpty());
    }
}
