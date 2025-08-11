package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EqualsMethod {
	int id;
	String name;
	 EqualsMethod(int id , String name) {
		this.id = id;
		this.name = name;
	}
	 // Overiding equal () to compare the object content
	 @Override
	 public boolean equals(Object obj) {
		 if (this == obj) return true ; // same reference
		 if(obj == null || getClass()!= obj.getClass()) return false;
		 Emlpoyee1 other  = (Emlpoyee1)obj;
		 return this.id == other.id && this.name.equals(other.name);

	 }


	 @Override

	 public int hashCode() {

		 return Objects.hash(id ,name);

	 }

	 @Override

	 public String toString() {

			return id   + "_" + name;


		}


 
	public static void main(String[] args) {

		List<Emlpoyee1>  empoyees = new ArrayList<>();

		empoyees.add(new Emlpoyee1 (103, "Ravi"));

		empoyees.add(new Emlpoyee1 (101, "Amit"));

		empoyees.add(new Emlpoyee1 (102, "Zara"));


		empoyees.add(new Emlpoyee1 (102, "Zara"));


		empoyees.add(new Emlpoyee1 (104, "John"));


		for (Emlpoyee1 e: empoyees ) {

			System.out.println(e);

		}
 
	}

}
