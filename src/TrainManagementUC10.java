import java.util.*;
import java.util.stream.*;

public class TrainManagementUC10 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC10) ===");

        // Bogie → Capacity map
        Map<String, Integer> bogieMap = new HashMap<>();

        bogieMap.put("Sleeper", 72);
        bogieMap.put("AC Chair", 56);
        bogieMap.put("First Class", 24);
        bogieMap.put("Luxury Coach", 80);

        // Calculate total seating capacity using Stream + reduce
        int totalCapacity = bogieMap.values()
                .stream()
                .map(capacity -> capacity)   // extract values
                .reduce(0, Integer::sum);   // sum all values

        // Display result
        System.out.println("\nTotal Seating Capacity: " + totalCapacity);
    }
}