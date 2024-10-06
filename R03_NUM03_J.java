import java.io.DataInputStream;
import java.io.IOException;

public class NUM03_J {

    public static int getInteger(DataInputStream is) throws IOException {
        // Non-Compliant Code
        return is.readInt();

        /*
        // Compliant Code
        return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
        */
    }
}
