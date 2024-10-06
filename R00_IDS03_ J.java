import java.util.logging.Logger;
import java.util.regex.Pattern;

public class IDS03_J {
    private static final Logger logger = Logger.getLogger(IDS03_J.class.getName());

    public static void logUserLogin(String username, boolean loginSuccessful) {
        // Non-Compliant Code
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + username);
        } else {
            logger.severe("User login failed for: " + username);
        }

        /*
        // Compliant Code
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + sanitizeUser(username));
        } else {
            logger.severe("User login failed for: " + sanitizeUser(username));
        }
        */
    }

    /*
    public static String sanitizeUser(String username) {
        return Pattern.matches("[A-Za-z0-9]+", username) ? username : "unauthorized user";
    }
    */
}


