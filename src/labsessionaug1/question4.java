//Read back the list of students from the file and display it.
 
package labsessionaug1;
import java.io.*;
import java.util.*;
public class question4 {
    public static void main(String[] args) {
        ArrayList<String> stud =new ArrayList<>();
        stud.add("Akhil");
        stud.add("sindhu");
        stud.add("ram");
        stud.add("swaraj");
        stud.add("shivani");
        stud.add("harsha");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C://Users//Akhil//Downloads//programming3.txt"))) {
            for (String s : stud) {
                writer.write(s);
                writer.newLine(); 
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("C://Users//Akhil//Downloads//programming3.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

