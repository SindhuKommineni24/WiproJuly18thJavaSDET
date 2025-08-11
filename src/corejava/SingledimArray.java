package corejava;

public class SingledimArray {
	public  static void main(String[] args) {
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		//access the single element
		System.out.print(a[1]);
	}

}
