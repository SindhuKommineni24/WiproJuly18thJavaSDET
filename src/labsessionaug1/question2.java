package labsessionaug1;
import java.io.File;
public class question2 {
    public static void main(String[] args) {
        String folderPath = "C:\\Users\\Akhil\\Downloads";
        File folder = new File(folderPath);
        if (folder.exists() && folder.isDirectory()) {
            String[] list = folder.list();
            if (list != null && list.length > 0) {
                for (String name : list) {
                    System.out.println(name);
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("Invalid directory path.");
        }
    }
}

