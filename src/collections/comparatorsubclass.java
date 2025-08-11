package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 
public class comparatorsubclass implements Comparator<Emlpoyee1>{
	public int compare(Emlpoyee1 e1,Emlpoyee1 e2) {
			//return e1.name.compareTo(e2.name);//Ascendingorder
		return e2.name.compareTo(e1.name);//descendingorder
			
		}
		
	
public static void main(String[] args) {
	List<Emlpoyee1> employee=new ArrayList<>();
	employee.add(new Emlpoyee1(103,"Ravi"));
	employee.add(new Emlpoyee1(101,"Amit"));
	employee.add(new Emlpoyee1(102,"Raju"));
	employee.add(new Emlpoyee1(104,"sai"));
	Collections.sort(employee,new comparatorsubclass());
	for (Emlpoyee1 emp:employee) {
		System.out.println(emp);
	}
 
}
}