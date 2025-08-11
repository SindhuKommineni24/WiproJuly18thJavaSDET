/*3.Write a Java programming to create a banking 
 * system with three classes - Accounts should be an
 *  interface with methods to deposit, withdraw, 
 *  calculate interest, and view balances. 
 *  SavingsAccount and CurrentAccount should implement
 *   the Account interface and have their own unique methods. 
 */
package labsession4;

public interface InterfaceAccount {
	void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    double getBalance();
    
}
