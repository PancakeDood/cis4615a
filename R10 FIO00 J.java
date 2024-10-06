import java.io.File;

public class FIO00_J {

    public static void deleteFile() {
        // Non-Compliant Code
        File file = new File("/shared/tmp/file.txt");
        file.delete();

        /*
        // Compliant Code
        File file = new File(System.getProperty("java.io.tmpdir") + "/file.txt");
        file.delete();
        */
    }
}
