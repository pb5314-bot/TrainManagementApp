import java.util.*;
import java.util.stream.*;

public class TrainManagementUC12 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC12) ===");

        // Create list of goods bogies (type → cargo)
        List<Map<String, String>> bogies = new ArrayList<>();

        // Adding bogies
        bogies.add(Map.of("type", "Cylindrical", "cargo", "Petroleum"));
        bogies.add(Map.of("type", "Open", "cargo", "Coal"));
        bogies.add(Map.of("type", "Box", "cargo", "Grain"));
        bogies.add(Map.of("type", "Cylindrical", "cargo", "Petroleum"));

        // Safety validation using allMatch()
        boolean isSafe = bogies.stream()
                .allMatch(b -> {
                    String type = b.get("type");
                    String cargo = b.get("cargo");

                    // Rule: Cylindrical → only Petroleum allowed
                    if (type.equals("Cylindrical")) {
                        return cargo.equals("Petroleum");
                    }
                    return true; // other bogies allowed
                });

        // Display result
        if (isSafe) {
            System.out.println("\nTrain is SAFE and compliant.");
        } else {
            System.out.println("\nTrain is UNSAFE! Invalid cargo detected.");
        }
    }
}