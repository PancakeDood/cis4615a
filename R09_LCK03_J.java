//Do not synchronize on objects that may be reused
// Non-Compliant Code
public class LockExample {
    private final String lock = "LOCK";  // A string literal that can be reused

    public void doSomething() {
        synchronized (lock) {
            System.out.println("Doing something with a reused lock");
        }
    }
}

/*
// Compliant Code
public class LockExample {
    private final Object lock = new Object();  // Use a private object for synchronization

    public void doSomething() {
        synchronized (lock) {
            System.out.println("Doing something with a proper lock");
        }
    }
}
*/
