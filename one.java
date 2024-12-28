import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Greet the user
        System.out.println("Hello! What's your name?");

        // Read the user's input
        String name = scanner.nextLine();

        // Display a personalized message
        System.out.println("Nice to meet you, " + name + "! Have a great day!");

        // Close the scanner
        scanner.close();
    }
}