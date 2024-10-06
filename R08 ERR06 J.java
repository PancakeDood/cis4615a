import java.io.IOException;

public class ERR06_J {

    public void someMethod() throws Exception {
        // Non-Compliant Code
        throw new Exception("Error occurred");

        /*
        // Compliant Code
        public void someMethod() throws IOException {
            throw new IOException("Error occurred");
        }
        */
    }
}
