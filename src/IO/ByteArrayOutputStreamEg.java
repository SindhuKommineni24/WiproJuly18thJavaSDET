package IO;
import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStreamEg {
	public static void main(String[] args) {
		//read the array of Input data
		String data="This is a line of text inside the String.";
		try {
			ByteArrayOutputStream output=new ByteArrayOutputStream();
			byte[] array=data.getBytes();
			
			//write data to the output stream
			output.write(array);
			
			String streamdata=output.toString();
			System.out.println("output stream:"+streamdata);
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
