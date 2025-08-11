package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Employee implements Comparable<Employee> { 
    int id;
    String name;
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int compareTo(Employee e) {
        return this.name.compareTo(e.name);
    }
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(103, "Ravi"));
        empList.add(new Employee(101, "Amit"));
        empList.add(new Employee(102, "Zara"));
        Collections.sort(empList);
        for (Employee e : empList) {
            System.out.println(e);
        }
    }
}
