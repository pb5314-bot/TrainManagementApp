import java.util.*;
import java.util.stream.Collectors;

public class TrainManagementUC9 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC9) ===");

        // Create list of bogie types (with duplicates for grouping)
        List<String> bogies = Arrays.asList(
                "Sleeper",
                "AC Chair",
                "Sleeper",
                "First Class",
                "AC Chair",
                "Cargo",
                "Cargo"
        );

        // Group bogies using Stream API
        Map<String, List<String>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b));

        // Display grouped result
        System.out.println("\nGrouped Bogies:");
        for (Map.Entry<String, List<String>> entry : groupedBogies.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}