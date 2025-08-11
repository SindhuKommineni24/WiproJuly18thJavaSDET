//2.Create a Arraylist and sort a list of integers
package labsession8;
import java.util.*;
public class question3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(23, 45, 12, 8, 56, 34));
        Collections.sort(list);
        System.out.println(list);
    }
}

