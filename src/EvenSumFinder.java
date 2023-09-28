public class EvenSumFinder {
    public static void main(String[] args) {
        // Initialize a variable to store the sum
        int sum = 0;

        // Use a for loop to iterate through numbers from 1 to 20
        for (int i = 1; i <= 20; i++) {
            // Check if the current number (i) is even
            if (i % 2 == 0) {
                // If it's even, add it to the sum
                sum += i;
            }
        }

        // Print the final sum
        System.out.println("The sum of even numbers from 1 to 20 is: " + sum);
    }
}
