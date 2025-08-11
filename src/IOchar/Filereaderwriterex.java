package IOchar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class Filereaderwriterex {
	public static void main(String[] args) throws IOException {
		
		//write to the file using file reader
		FileWriter fw=new FileWriter("C://Users//Akhil//Downloads//programming1.txt");
		fw.write("I am the file writer");
		fw.close();
		//reading from file using file reader
		FileReader fr=new FileReader("C://Users//Akhil//Downloads//programming.txt");
		int i;
		while((i=fr.read())!=-1) {
			System.out.print((char)i);
		}
		fr.close();
		
		//reading and writing line by line buffered reader and writer is used
		BufferedWriter bw=new BufferedWriter(new FileWriter("C://Users//Akhil//Downloads//programming2.txt"));
		bw.write("I am the buffered file writer");
		bw.close();
		
		//read the file
		BufferedReader br=new BufferedReader(new FileReader("C://Users//Akhil//Downloads//programming2.txt"));
		String line;
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
		
		//reading and writing line by line using stringreader and string writer
		// Write to string in memory
		StringWriter sw = new StringWriter();
		sw.write("I am the in-memory writer");
		sw.close();

		// Read from that string
		StringReader sr = new StringReader(sw.toString());
		int ch;
		while ((ch = sr.read()) != -1) {
		    System.out.print((char) ch);
		}
		sr.close();

        
        
        //reading and writing line by line using CharArrayreader and writer
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        BufferedWriter bw2 = new BufferedWriter(charArrayWriter);
        bw2.write("This is written to CharArrayWriter.");
        bw2.newLine();
        bw2.write("It stores the content in memory.");
        bw2.close(); 
        
        CharArrayReader charArrayReader = new CharArrayReader(charArrayWriter.toCharArray());
        BufferedReader br2 = new BufferedReader(charArrayReader);
        String line2;
        while ((line2 = br2.readLine()) != null) {
            System.out.println(line2);
        }
        br.close();  
	}

}
