package IOchar;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEg {
	public static void main(String[] args) throws IOException{
		try {
		//serialization is the process of converting objects into bytes
		
		//write object ()
		
		//creating the object
		Student s1=new Student(89,"sindhu");
		
		//creating the output stream writing the object
		FileOutputStream fout=new FileOutputStream("C://Users//Akhil//Downloads//programming2.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(s1);
		out.flush();
		
		//closing the stream
		fout.close();
		out.close();
		System.out.println("object is serialazed");
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
