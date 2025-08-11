package labsessionaug1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class question3 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Akhil\\Downloads\\programming.txt";
        try {
            File file = new File(filePath);
            // Create a byte array the same length as the file
            byte[] byteArray = new byte[(int) file.length()];
            // Read file into byte array
            FileInputStream fis = new FileInputStream(file);
            fis.read(byteArray);
            fis.close();

            // Display contents (optional: use new String() for text files)
            System.out.println("File read into byte array. Byte length: " + byteArray.length);
            System.out.println("Content as text:\n" + new String(byteArray));

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
