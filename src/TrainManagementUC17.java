import java.util.Arrays;

public class TrainManagementUC17 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC17) ===");

        // Array of bogie names
        String[] bogies = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Display original array
        System.out.println("\nOriginal Bogie Names:");
        System.out.println(Arrays.toString(bogies));

        // Sort using built-in method
        Arrays.sort(bogies);

        // Display sorted array
        System.out.println("\nSorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogies));
    }
}