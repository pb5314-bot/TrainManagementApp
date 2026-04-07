import java.util.Scanner;

public class TrainManagementUC18 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC18) ===");

        // Array of bogie IDs (unsorted)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Bogie ID to search: ");
        String searchKey = sc.nextLine();

        // Linear Search
        boolean found = false;

        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(searchKey)) {
                found = true;
                break; // stop when found
            }
        }

        // Display result
        if (found) {
            System.out.println("Bogie ID " + searchKey + " FOUND in train.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT FOUND.");
        }

        sc.close();
    }
}