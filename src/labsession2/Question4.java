/*Write a Java program to create a class 
 * called Employee with methods called work() 
 * and getSalary(). Create a subclass called HRManager 
 * that overrides the work() method and adds a new method 
 * called addEmployee().
 */

package labsession2;

class Employee {
    public void work() {
        System.out.println("Employee");
    }

    public double getSalary() {
        return 30000.0; 
    }
}

class HRManager extends Employee {
    public void work() {
        System.out.println("HR Manager");
    }

    public void addEmployee() {
        System.out.println("New employee");
    }
}
public class Question4 {
	public static void main(String[] args) {
        Employee emp = new Employee();
        emp.work();
        System.out.println(emp.getSalary());
        HRManager hr = new HRManager();
        hr.work();               
        System.out.println( hr.getSalary());
        hr.addEmployee();        
    }
}
