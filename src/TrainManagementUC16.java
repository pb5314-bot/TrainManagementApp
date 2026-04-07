public class TrainManagementUC16 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC16) ===");

        // Array of passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        // Display original array
        System.out.println("\nOriginal Capacities:");
        printArray(capacities);

        // Bubble Sort
        for (int i = 0; i < capacities.length - 1; i++) {
            for (int j = 0; j < capacities.length - i - 1; j++) {

                // Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // Display sorted array
        System.out.println("\nSorted Capacities (Ascending):");
        printArray(capacities);
    }

    // Helper method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}