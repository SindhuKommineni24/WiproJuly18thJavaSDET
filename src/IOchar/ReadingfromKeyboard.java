package IOchar;

import java.util.Scanner;

public class ReadingfromKeyboard {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your first num");
		int n=sc.nextInt();
		System.out.println("enter your second num");
		int m=sc.nextInt();
		System.out.println(m+n);
		sc.close();
	}

}
