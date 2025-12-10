/****************************************************
 * Program Name: Digits
 * Package: Mastery
 * Purpose:
 *      This program allows the user to enter an
 *      integer and then choose to display the
 *      whole number or specific digits (ones,
 *      tens, hundreds) using a menu.
 *
 * Author: Malik Abbas
 * Date: Dec 1, 2026
 ****************************************************/

package Mastery;  // Says this file belongs to the Mastery folder

import java.util.Scanner;  // Lets us read input from the keyboard

/****************************************************
 * Class: Digits
 * Purpose:
 *      Contains the main method and controls the menu.
 ****************************************************/
public class Digits {

    public static void main(String[] args) {

        Input input = new Input();  // Makes an Input object to read user input

        System.out.print("Enter an integer: ");  // Asks the user for a number
        int number = input.readInt();            // Reads the number they typed

        Num num = new Num(number);  // Makes a Num object to work with the digits

        // ===================== MENU LOOP =====================
        while (true) {  // Loop repeats forever until user chooses to quit

            // Shows menu choices on the screen
            System.out.println("\nShow (W)hole number");
            System.out.println("Show (O)nes digit");
            System.out.println("Show (T)ens digit");
            System.out.println("Show (H)undreds digit");
            System.out.println("(Q)uit");

            System.out.print("Enter your choice: ");  
            String choice = input.readString().toLowerCase();  
            // Reads the user's menu choice and makes it lowercase

            // ===================== USER CHOICE HANDLING =====================
            if (choice.equals("w")) {  
                // If the user picked W, show the full number
                System.out.println("Whole number: " + num.getNumber());
            }
            else if (choice.equals("o")) {  
                // If the user picked O, show the ones digit
                System.out.println("Ones digit: " + num.getOnesDigit());
            }
            else if (choice.equals("t")) {  
                // If the user picked T, show the tens digit
                System.out.println("Tens digit: " + num.getTensDigit());
            }
            else if (choice.equals("h")) {  
                // If the user picked H, show the hundreds digit
                System.out.println("Hundreds digit: " + num.getHundredsDigit());
            }
            else if (choice.equals("q")) {  
                // If the user picked Q, quit the program
                System.out.println("Goodbye!");
                break;  // Leaves the while loop
            }
            else {  
                // If their input doesn't match any menu choice
                System.out.println("Invalid choice, please try again.");
            }
        }
    }

    /****************************************************
     * Inner Class: Num
     * Purpose:
     *      Stores a number and provides digit methods.
     ****************************************************/
    static class Num {
        private int number;  // Stores the user's number

        /****************************************************
         * Constructor: Num
         * Purpose: saves the number into the object
         ****************************************************/
        public Num(int number) {
           number = number;  // Stores the number they typed
        }

        /****************************************************
         * Method: getNumber
         * Purpose: returns the whole number
         ****************************************************/
        public int getNumber() {
            return number;  // Gives back the full number
        }

        /****************************************************
         * Method: getOnesDigit
         * Purpose: returns the ones place digit
         ****************************************************/
        public int getOnesDigit() 
        {
        	int x;
        	x = number % 10;
            return x;
            // Makes number positive → divide by 10 → get the remainder (ones digit)
        }

        /****************************************************
         * Method: getTensDigit
         * Purpose: returns the tens place digit
         ****************************************************/
        public int getTensDigit() {
            return Math.abs(number) / 10 % 10;  
            // Makes number positive → removes ones digit → gets tens digit
        }

        /****************************************************
         * Method: getHundredsDigit
         * Purpose: returns the hundreds place digit
         ****************************************************/
        public int getHundredsDigit() {
            return Math.abs(number) / 100 % 10;  
            // Makes number positive → removes tens/ones → gets hundreds digit
        }
    }

    /****************************************************
     * Inner Class: Input
     * Purpose:
     *      Simple helper to read from the keyboard.
     ****************************************************/
    static class Input {

    	private Scanner scanner;  // Tool used to read from the keyboard

        /****************************************************
         * Constructor: Input
         * Purpose: creates a Scanner for reading input
         ****************************************************/
        public Input() {
            scanner = new Scanner(System.in);  // Scanner is ready to read
        }

        /****************************************************
         * Method: readInt
         * Purpose: reads and returns an integer
         ****************************************************/
        public int readInt() {
            return scanner.nextInt();  // Reads a whole number
        }

        /****************************************************
         * Method: readString
         * Purpose: reads and returns one word
         ****************************************************/
        public String readString() {
            return scanner.next();  // Reads one word (no spaces)
        }
    }
}

