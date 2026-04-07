import java.util.ArrayList;
import java.util.List;

public class TrainManagementUC2 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC2) ===");

        // Create ArrayList for Passenger Bogies
        List<String> passengerBogies = new ArrayList<>();

        // ADD bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // DISPLAY after insertion
        System.out.println("\nPassenger Bogies after addition:");
        System.out.println(passengerBogies);

        // REMOVE a bogie
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        // CHECK existence
        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("\nDoes Sleeper exist? " + exists);

        // FINAL STATE
        System.out.println("\nFinal Passenger Bogies:");
        System.out.println(passengerBogies);
    }
}