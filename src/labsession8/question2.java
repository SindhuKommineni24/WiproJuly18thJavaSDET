//1.Create a set  and  find Duplicate Elements in set
package labsession8;
import java.util.*;

public class question2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 10, 40, 50, 20, 60);
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (Integer num : list) {
            if (!set.add(num)) {
                duplicates.add(num);
            }
        }
        System.out.println(duplicates);
    }
}
