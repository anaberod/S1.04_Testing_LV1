import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your DNI number (without letter):");
        int number = scanner.nextInt();

        try {
            DNICalculation dni = new DNICalculation(number);
            System.out.println("Your full DNI is " + dni.getFullDNI());
        } catch (IllegalArgumentException e) {
            System.out.println("Error " + e.getMessage());
        }

        scanner.close();
    }
}
