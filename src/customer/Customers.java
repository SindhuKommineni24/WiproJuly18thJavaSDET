package customer;

public class Customers {
    // Protected data members
    protected String customerName = "Sindhu";
    protected int customerId = 7890;
    protected String customerDepartment = "Support";

    // Protected method 
    protected void displayCustomerDetails() {
        System.out.println("Customer Name " + customerName);
        System.out.println("Customer ID " + customerId);
        System.out.println("Customer Department " + customerDepartment);
    }

    public static void main(String[] args) {
        Customers customer = new Customers();
        customer.displayCustomerDetails(); 
    }
}
