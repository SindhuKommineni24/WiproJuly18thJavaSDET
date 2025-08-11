package IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FilterOutputStreamEx {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        OutputStream filterOut = null;

        try {
            // Create FileOutputStream for the file
            fos = new FileOutputStream("C://Users//Akhil//Downloads//programming.txt");

            // Wrap FileOutputStream with BufferedOutputStream (a subclass of FilterOutputStream)
            filterOut = new BufferedOutputStream(fos);

            // Write the data to the file
            String text = "Hi how are you";
            filterOut.write(text.getBytes());
            filterOut.flush(); // optional but good practice to ensure all data is written

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            try {
                if (filterOut != null) filterOut.close();
                if (fos != null) fos.close();
            } catch (Exception e) {
                System.out.println("Error closing streams: " + e);
            }
        }
    }
}
