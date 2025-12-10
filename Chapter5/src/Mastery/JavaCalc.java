package Mastery;

import java.util.Scanner;

public class JavaCalc {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int num1 = (int)(Math.random() * 11 + 1);
        int num2 = (int)(Math.random() * 11 + 1);
        int operator = (int)(Math.random() * 4 + 1);
        int answer;
        int total = 0;

        if (operator == 1) { 
            System.out.print("Number " + num1 + " + number " + num2 + " equals: ");
            answer = reader.nextInt();
            total = num1 + num2;
        } else if (operator == 2) { 
            System.out.print("Number " + num1 + " - number " + num2 + " equals: ");
            answer = reader.nextInt();
            total = num1 - num2;
        } else if (operator == 3) {
            System.out.print("Number " + num1 + " * number " + num2 + " equals: ");
            answer = reader.nextInt();
            total = num1 * num2;
        } else { 
            
            if (num2 == 0) num2 = 1;
            System.out.print("Number " + (num1 * num2) + " / number " + num2 + " equals: ");
            answer = reader.nextInt();
            total = (num1 * num2) / num2;
        }

        if (answer == total) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong, the correct answer is " + total);
        }

        reader.close();
    }
}
