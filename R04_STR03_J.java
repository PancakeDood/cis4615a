import java.math.BigInteger;

public class STR03_J {

    public static void encodeNonCharacterData() {
        // Non-Compliant Code
        BigInteger x = new BigInteger("530500452766");
        byte[] byteArray = x.toByteArray();
        String s = new String(byteArray);
        byteArray = s.getBytes();
        x = new BigInteger(byteArray);

        /*
        // Compliant Code
        BigInteger x = new BigInteger("530500452766");
        String s = x.toString(); // Valid character data
        byte[] byteArray = s.getBytes();
        String ns = new String(byteArray);
        x = new BigInteger(ns);
        */
    }
}
