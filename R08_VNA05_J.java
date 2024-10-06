// Non-Compliant Code
public class AtomicExample {
    private long count;

    public void increment() {
        count++;  // Non-atomic operation on 64-bit value
    }
}

/*
// Compliant Code
public class AtomicExample {
    private volatile long count;

    public synchronized void increment() {
        count++;  // Synchronize access to ensure atomicity
    }
}
*/