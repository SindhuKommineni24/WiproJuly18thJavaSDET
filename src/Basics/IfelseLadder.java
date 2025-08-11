package Basics;

public class IfelseLadder {
	public static void main(String[] args) {
		String branch="KPHB Colony";
		if(branch=="Miyapur") {
			System.out.println("Deposit scheme is available");
		}
		else if(branch=="KPHB Colony") {
			System.out.println("Retirement plan scheme is available");
		}else if(branch=="Uppal") {
			System.out.println("Insurance plan scheme is available");
		}else {
			System.out.println(branch);
		}
	}

}