/****************************************************
 * Program Name: MySavings
 * Package: Mastery
 * Description:
 *      This program simulates a piggy bank. The user
 *      can add or remove coins and view the total
 *      money stored in the piggy bank.
 *
 * Author: Malik Abbas
 * Date: Dec 1 2025
 ****************************************************/

package Mastery; // Declares that this class belongs to the Mastery package

/****************************************************
 * Class: MySavings
 * Purpose:
 *      Runs the program and demonstrates how the
 *      PiggyBank class works without using a Scanner.
 ****************************************************/
public class MySavings { // Begins the MySavings class

    public static void main(String[] args) { // The main method starts the program

        PiggyBank bank = new PiggyBank(); // Creates a PiggyBank object that stores coin amounts

        // ================== ADDING COINS ==================
        bank.pennies++;  // Increases the penny count by 1
        bank.nickels++;  // Increases the nickel count by 1
        bank.dimes++;    // Increases the dime count by 1
        bank.quarters++; // Increases the quarter count by 1

        // ================== REMOVING COINS ==================
        if (bank.nickels > 0) { // Checks if there is at least 1 nickel to remove
            bank.nickels--;     // Subtracts one nickel from the total
        }

        // ================== DISPLAY TOTAL ==================
        System.out.printf("Total: $%.2f\n", bank.getTotal()); 
        // Prints the total value of all coins, formatted to 2 decimal places
    }

    /****************************************************
     * Inner Class: PiggyBank
     * Purpose:
     *      Holds the number of coins and calculates
     *      the total money value inside the piggy bank.
     ****************************************************/
    static class PiggyBank { // Begins the PiggyBank inner class

        // Coin counters: each variable stores how many coins of that type exist
        int pennies;   // Number of pennies stored
        int nickels;   // Number of nickels stored
        int dimes;     // Number of dimes stored
        int quarters;  // Number of quarters stored

        double getTotal() { // Method that calculates the total monetary value
            return pennies * 0.01   // Converts penny count to dollars and adds to total
                 + nickels * 0.05   // Converts nickel count to dollars and adds to total
                 + dimes * 0.10     // Converts dime count to dollars and adds to total
                 + quarters * 0.25; // Converts quarter count to dollars and adds to total
        }
    } // End of PiggyBank class
} // End of MySavings class
