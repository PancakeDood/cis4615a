import java.util.ArrayList;
import java.util.List;

public class MSC04_J {

    // Non-Compliant Code
    private static List<MSC04_J> employees = new ArrayList<>();

    public void addEmployee(MSC04_J emp) {
        employees.add(emp);
    }

    /*
    // Compliant Code
    private List<MSC04_J> employees = new ArrayList<>();

    public void addEmployee(MSC04_J emp) {
        employees.add(emp);
    }
    */
}
