package IOchar;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationEg {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		//create the stream and read the object
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("C://Users//Akhil//Downloads//programming2.txt"));
		Student s=(Student)in.readObject();
		//printing the object details
		System.out.println(s.id+" "+s.name);
		
		in.close();
		
	}

}
