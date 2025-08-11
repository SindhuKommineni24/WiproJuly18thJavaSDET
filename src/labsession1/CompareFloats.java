package labsession1;
import java.util.Scanner;
public class CompareFloats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        int int1 = (int)(num1 * 100);
        int int2 = (int)(num2 * 100);
        if (int1 == int2) {
            System.out.println("Numbers are the same up to two decimal places.");
        } else {
            System.out.println("Numbers are different.");
        }
    }
}

