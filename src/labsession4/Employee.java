/*Employee Salary Validation
Create a Employee class with private fields: name, id, salary
Salary must be positive — implement validation inside the setter
Add a method to displayDetails() showing all info
Create multiple employee objects and test with different salary values.
 */

package labsession4;

public class Employee {
	private String name;
	private int id;
	private double salary;
	
	//getter methods
	public String getname() {
		return name;
	}
	
	public int getid() {
		return id;
	}
	
	public double salary() {
		return salary;
	}
	
	//setter methods
	public void setname(String name) {
		this.name=name;
	}
	
	public void setid(int id) {
		this.id=id;
	}
	
	public void setsalary(double salary) {
		if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid");
            this.salary = 0;
        }
    }
	
	public void displayDetails() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setname("sindhu");
		e1.setid(423);
		e1.setsalary(40000);
		
		e1.displayDetails();
	
	}

}
