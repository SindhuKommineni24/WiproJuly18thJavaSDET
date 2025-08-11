package labsessionaug1;
import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        String name = sc.nextLine();
        String branch = sc.nextLine();
        String Collegename=sc.nextLine();
        String address=sc.nextLine();
        double percentage = sc.nextDouble();
       
        System.out.println(name);
        System.out.println(branch);
        System.out.println(Collegename);
        System.out.println(address);
        System.out.println(percentage);

        sc.close(); 
    }
}
