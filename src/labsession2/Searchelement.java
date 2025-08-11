package labsession2;
import java.util.*;
public class Searchelement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		boolean f=false;
		for(int i=0;i<n;i++) {
			if(a[i]==k) {
				f=true;
			}
		}
		if(f==true)
			System.out.print("found");
		else
			System.out.print("not found");
	}
}
