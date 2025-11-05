import java.util.Scanner;

public class Mastery2Ch4 {
    public static void main(String[] args) {
        ObjectHeight.run();
    }
}

class ObjectHeight {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        double time;

        do {
            System.out.print("Enter a time less than 4.5 seconds: ");
            time = scanner.nextDouble();

            if (time >= 4.5) {
                System.out.println("Please enter a time less than 4.5 seconds.");
            }
        } while (time >= 4.5);

        double height = 100 - 4.9 * Math.pow(time, 2);
        System.out.printf("The height of the object is: %.1f\n", height);

        scanner.close();
    }
}