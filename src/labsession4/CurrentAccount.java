package labsession4;

public class CurrentAccount implements InterfaceAccount {
    private double balance;
    private final double interestRate = 0.0;

    public CurrentAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited to Current Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn from Current Account.");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    // Optional unique method
    public void checkOverdraftStatus() {
        if (balance < 0) {
            System.out.println("Account is in overdraft!");
        } else {
            System.out.println("Account is in good standing.");
        }
    }
}
