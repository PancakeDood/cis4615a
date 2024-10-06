import java.io.File;

public class EXP00_J {

    public void deleteFile() {
        // Non-Compliant Code
        File someFile = new File("someFileName.txt");
        someFile.delete();

        /*
        // Compliant Code
        File someFile = new File("someFileName.txt");
        if (!someFile.delete()) {
            // Handle failure to delete the file
            System.err.println("Failed to delete " + someFile.getName());
        }
        */
    }
}
