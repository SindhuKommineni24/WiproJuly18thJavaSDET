package corejava;
public class Operators {
	public static void main(String[] args) {
		//unary
		
		int i=10;
		i++;
		System.out.println(i);
		i--;
		System.out.println(i);
		++i;
		System.out.println(i);
		--i;
		System.out.println(i);
		
		//arthimetic operators
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		int d=a-b;
		System.out.println(d);
		int e=a/b;
		System.out.println(e);
		int f=a*b;
		System.out.println(f);
		
		//shift operators
		
		//left shift <<
		System.out.println(10<<2); // 10*2^2 = 40
		System.out.println(10<<3); //10*2^3 = 80
		
		//right shift >>
		System.out.println(10>>2); // 10/2^2 = 2
		System.out.println(20>>2); // 20/2^2 = 5
		
		
		//relational operators  > < >= <=  == !=
		int g=10,h=20;
		System.out.println(g==h); //false
		System.out.println(g!=h); //true
		System.out.println(g>h);  //false
		System.out.println(g<h);  //true
		System.out.println(g>=h); //false
		System.out.println(g<=h); //true
		
		//bitwise operators
		int p = 5; //   0101
		int q = 3; //   0011
		int r = p&q; // 0001
		System.out.println(r);
		
		// 8 & 2
		// 8 - 1000
		// 2 - 0010
		//     0000 
		
		int a1=8;
		int b1=2;
		int c1=8&2;
		System.out.println(c1);
		
		//bitwise or it should be present in any one
		
		int a2=8;   //1000
		int b2=2;   //0010
		int c2=8|2; //1010
		System.out.println(c2);
		
		//bitwise xor if it is set in one operand but not both
		int a3=8;   //1000
		int b3=2;   //0010
		int c3=8^2; //1010
		System.out.println(c3);
		
		
		//logical operators &&-AND, ||-OR, !
		
		//&&- returns true if both operands are ture, otherwise return false
		int u=10,v=20;
		if(u<v && v>15) {
			System.out.println("both conditions are true");
		}
		
		// ||  - returns true if atleast one of the operand is true
		int age=25;
		if(age<18 || age>21) {
			System.out.println("condition is true");
		}
		
		// ! NOT - reverse the logical state of the operand
		boolean isRaining = false;
		if(!isRaining) {
			System.out.println("you can go out");
		}
		
		//assignment operators =, +=, -=
		int k=10;
		int l = 20;
		k+= 4; //14
		System.out.println(k);
		l-=4; //16
		System.out.println(l);
		
		
		//Ternary operator short hand for if-else
		// condition ? expression_if_true : expression_if_false;
		int w1=10, w2=20;
		int max = (w1>w2) ? w1:w2;
		System.out.println(max);
		int min = (w1<w2)? w1:w2;
		System.out.println(min);
		
	}
}

