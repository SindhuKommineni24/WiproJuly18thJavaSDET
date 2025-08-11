package labsession3;

class Payment {
    public void pay() {
        System.out.println("Payment initiated");
    }
}
class CreditCard extends Payment {
    public void pay() {
        System.out.println("Payment made using Credit Card");
    }
}

class UPI extends Payment {
    public void pay() {
        System.out.println("Payment made using UPI");
    }
}

class NetBanking extends Payment {
    public void pay() {
        System.out.println("Payment made using NetBanking");
    }
}

public class PaymentsOverriding {
	public static void main(String[] args) {
		Payment obj1=new Payment();
		obj1.pay();
		CreditCard obj2=new CreditCard();
		obj2.pay();
		UPI obj3=new UPI();
		obj3.pay();
		NetBanking obj4=new NetBanking();
		obj4.pay();
	}
}
