package labsession9;
import java.util.*;
public class Secondlargestelement {
    public static int second(int n, int arr[]) {
        int h1 = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > h1) {
                h1 = arr[i];
            }
        }
       int h2 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > h2 && arr[i] < h1) {
                h2 = arr[i];
            }
        }

        return h2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = second(n, arr);
        System.out.println(result);
    }
}
