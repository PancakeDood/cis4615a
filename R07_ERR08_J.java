// Non-Compliant Code
public class NullPointerExample {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());  // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException!");
        }
    }
}

/*
// Compliant Code
public class NullPointerExample {
    public static void main(String[] args) {
        String str = null;
        if (str != null) {
            System.out.println(str.length());
        } else {
            System.out.println("String is null!");
        }
    }
}
*/