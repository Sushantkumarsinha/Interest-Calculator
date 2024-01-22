package InterestCalculator;

import java.util.Scanner;

public class InterestCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nInterest Calculation System");
            System.out.println("1. Simple Interest");
            System.out.println("2. Compound Interest");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculateSimpleInterest(scanner);
                    break;
                case 2:
                    calculateCompoundInterest(scanner);
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void calculateSimpleInterest(Scanner scanner) {
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter interest rate: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter time period (in years): ");
        double time = scanner.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;
        double totalAmount = principal + simpleInterest;

        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Total Amount: " + totalAmount);
    }

    private static void calculateCompoundInterest(Scanner scanner) {
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter interest rate: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter time period (in years): ");
        double time = scanner.nextDouble();

        double compoundInterest = principal * Math.pow(1 + rate / 100, time) - principal;
        double totalAmount = principal + compoundInterest;

        System.out.println("Compound Interest: " + compoundInterest);
        System.out.println("Total Amount: " + totalAmount);
    }
}
