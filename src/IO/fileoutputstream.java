package IO;

import java.io.FileOutputStream;

public class fileoutputstream {

	public static void main(String[] args) {
		
		
		String data = "I am attending the java training class";
		
		try {
			
			FileOutputStream output = new FileOutputStream("C://Users//pranavi//Downloads//handling.txt/");

			byte[] array = data.getBytes();
			
			//write the byte array to the file
			
			output.write(array);
			
			output.close();
			
		}catch (Exception e) {
			
			System.out.println(e);
		}

	}

}