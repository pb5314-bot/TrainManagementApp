import java.util.*;
import java.util.stream.Collectors;

public class TrainManagementUC13 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC13) ===");

        // Create large dataset (bogie → capacity)
        Map<String, Integer> bogieMap = new HashMap<>();

        for (int i = 1; i <= 100000; i++) {
            bogieMap.put("Bogie" + i, (i % 100) + 20); // capacities between 20–119
        }

        // ---------------- LOOP-BASED FILTERING ----------------
        long startLoop = System.nanoTime();

        List<String> loopResult = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : bogieMap.entrySet()) {
            if (entry.getValue() > 60) {
                loopResult.add(entry.getKey());
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // ---------------- STREAM-BASED FILTERING ----------------
        long startStream = System.nanoTime();

        List<String> streamResult = bogieMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 60)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // ---------------- RESULTS ----------------
        System.out.println("\nLoop Result Size: " + loopResult.size());
        System.out.println("Stream Result Size: " + streamResult.size());

        System.out.println("\nLoop Execution Time: " + loopTime + " ns");
        System.out.println("Stream Execution Time: " + streamTime + " ns");
    }
}