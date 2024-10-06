import java.util.ArrayList;
import java.util.List;

// Non-Compliant Code
public class MutableExample {
    private List<String> items = new ArrayList<>();

    public List<String> getItems() {
        return items;  // Returning a reference to a mutable object
    }
}

/*
// Compliant Code
public class MutableExample {
    private List<String> items = new ArrayList<>();

    public List<String> getItems() {
        return new ArrayList<>(items);  // Return a copy of the list to avoid external modification
    }
}
*/