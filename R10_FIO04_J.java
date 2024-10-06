//Release resources when they are no longer needed
import java.io.*;

// Non-Compliant Code
public class FileExample {
    public void readFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        // Reader not closed - resource leak
    }
}

/*
// Compliant Code
public class FileExample {
    public void readFile() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }  // Reader is closed automatically using try-with-resources
    }
}
*/
