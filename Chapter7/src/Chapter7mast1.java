public class Chapter7mast1 {
    public static void main(String[] args) {
        // Call method to add the roof of the structure
        addRoof();
        // Call method to add the base of the structure
        addBase();
        // Call method to add the walk or support at the bottom
        addWalk();
    }

    // Method to print the roof of the structure
    public static void addRoof() {
        System.out.println("   /\\");   // Prints the top of the roof
        System.out.println("  /  \\");  // Prints the middle part of the roof
        System.out.println(" /____\\"); // Prints the base of the roof
    }

    // Method to print the base of the structure
    public static void addBase() {
        System.out.println(" |    |"); // Prints the sides of the base
        System.out.println(" |    |"); // Repeats for the height of the walls
        System.out.println(" |____|"); // Prints the bottom of the base
    }

    // Method to print the walk or support at the bottom
    public static void addWalk() {
        System.out.println("   ||"); // Prints the left support
        System.out.println("   ||"); // Prints the right support
    }
}