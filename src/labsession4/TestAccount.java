package labsession4;

public class TestAccount {
    public static void main(String[] args) {
        // Create a Savings Account
        SavingsAccount sa = new SavingsAccount(1000);
        sa.deposit(500);
        sa.withdraw(200);
        System.out.println(sa.calculateInterest());
        System.out.println(sa.getBalance());
        System.out.println();

        CurrentAccount ca = new CurrentAccount(1500);
        ca.deposit(300);
        ca.withdraw(1000);
        System.out.println(ca.calculateInterest());
        System.out.println(ca.getBalance());
        
        ca.checkOverdraftStatus();
        
    }
}
