/*Create an abstract class Employee with:
 
Fields: name, id
 
Abstract method calculateSalary()
 
Subclasses:
 
PermanentEmployee with fixed monthly salary
 
ContractEmployee with hourly rate and hours worked
 */

package labsession3;

abstract class Employee{
	String name="sindhu";
	int id=23;
	abstract double calculateSalary();
}

class PermanentEmployee extends Employee{
	double monthlysalary=35000;
	
	double calculateSalary() {
		return monthlysalary;
	}
}

class ContractEmployee extends Employee{
	double hourrate=700;
	int hoursworked=13;
	
	double calculateSalary() {
		return hourrate*hoursworked;
	}
}
public class Abstraction2 {
	public static void main(String[] args) {
		PermanentEmployee obj=new PermanentEmployee();
		System.out.println(obj.calculateSalary());
		
		ContractEmployee obj1=new ContractEmployee();
		System.out.println(obj1.calculateSalary());
		
	}

}
