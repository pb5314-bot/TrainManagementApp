import java.util.LinkedHashSet;
import java.util.Set;

public class TrainManagementUC5 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC5) ===");

        // Create LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add bogies (insertion order will be preserved)
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate
        trainFormation.add("Sleeper"); // duplicate → ignored

        // Display final formation
        System.out.println("\nFinal Train Formation (No duplicates, order preserved):");
        System.out.println(trainFormation);
    }
}