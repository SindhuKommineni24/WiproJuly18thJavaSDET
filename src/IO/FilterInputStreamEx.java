package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;

public class FilterInputStreamEx {
	public static void main(String[] args) {
		//filter stream folder data as they read and write data in the input
		//filter it and pass it on the underlying stream
		FileInputStream fis=null;
		FilterInputStream filterinput=null;
		try {
			//create fileinput stream for the file
			fis=new FileInputStream("C://Users//Akhil//Downloads//programming.txt");
			//wrap file input stream which buffered input stream
			filterinput=new BufferedInputStream(fis);
			//read and print the file content
			int data;
			while((data=filterinput.read())!=-1) {
				System.out.print((char)data);
				
			}
			fis.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
