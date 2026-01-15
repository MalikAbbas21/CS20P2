package Mastery;  // Package name (folder)

import java.util.Random;  // Import Random class to generate random numbers

public class EvensAndOdds {

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Create a Random object
        Random rand = new Random();

        // Create an array to store 25 integers
        int[] numbers = new int[25];

        // Generate 25 random numbers between 0 and 99
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100); // Generates numbers from 0 to 99
        }

        // Display all odd numbers
        System.out.print("odd: ");
        for (int num : numbers) {        // Loop through each number in the array
            if (num % 2 != 0) {           // Check if the number is odd
                System.out.print(num + " ");
            }
        }

        // Move to the next line and display all even numbers
        System.out.print("\neven: ");
        for (int num : numbers) {        // Loop through each number again
            if (num % 2 == 0) {           // Check if the number is even
                System.out.print(num + " ");
            }
        }
    }
}
