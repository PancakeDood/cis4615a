public class THI00_J {

    public static void runThread() {
        // Non-Compliant Code
        Thread t = new Thread(() -> {
            System.out.println("Hello from thread!");
        });
        t.run(); // Direct call to run() instead of start()

        /*
        // Compliant Code
        Thread t = new Thread(() -> {
            System.out.println("Hello from thread!");
        });
        t.start(); // Correctly starts the thread
        */
    }
}
