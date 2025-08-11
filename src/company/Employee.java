package company;

public class Employee {
    // Protected variables
    public String e_name = "sindhu";
    public int e_Id = 423;
    public String e_department = "electronics";

   //protected method
    public void showDetails() {
        System.out.println("Employee Name: " + e_name);
        System.out.println("Employee ID: " + e_Id);
        System.out.println("Department: " + e_department);
    }

    
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.showDetails();  
    }
}

