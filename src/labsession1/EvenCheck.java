package labsession1;
import java.util.Scanner;
public class EvenCheck {
    public static boolean isEven(int n) {
        return n% 2 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        boolean b=isEven(n);
        if (b==true) {
            System.out.println(n + " is even.");
        } else {
            System.out.println(n + " is odd.");
        }
    }
}

