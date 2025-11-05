package Mastery;

import java.util.Scanner;

public class Mastery {
    public static void main(String[] args) {
        final double c = 3.0e8;
        final int energyPerBulb = 360000;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the mass in kilograms: ");
        double m = scanner.nextDouble();

        double energy = m * c * c;
        int bulbs = (int) (energy / energyPerBulb);

        System.out.println("Energy: " + energy + " Joules");
        System.out.println("The minimum number of light bulbs that can be powered for an hour:");
        System.out.println("Quarters: " + (bulbs / 4));
        System.out.println("Dimes: " + (bulbs / 10));
        System.out.println("Nickels: " + (bulbs / 20));
        System.out.println("Pennies: " + (bulbs));
        
        scanner.close();
    }
}