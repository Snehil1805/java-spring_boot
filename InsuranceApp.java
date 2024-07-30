import java.util.Scanner;

public class InsuranceApp {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Choose an option:");
                System.out.println("1. Premium Calculation");
                System.out.println("2. Maturity Amount Calculation");
                System.out.println("3. Convert Policy Details to Upper Case");
                System.out.println("4. Convert Policy Details to Lower Case");
                System.out.println("5. Exit");
                int option = scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Enter age and sum assured:");
                        int age = scanner.nextInt();
                        double sumAssured = scanner.nextDouble();
                        double premium;
                        if (age < 25) {
                            premium = 0.05 * sumAssured;
                        } else if (age <= 40) {
                            premium = 0.10 * sumAssured;
                        } else {
                            premium = 0.20 * sumAssured;
                        }
                        System.out.println("The insurance premium is: " + premium);
                        break;
                    case 2:
                        System.out.println("Enter premium, term, and interest rate:");
                        double premiumAmount = scanner.nextDouble();
                        int term = scanner.nextInt();
                        double interestRate = scanner.nextDouble();
                        double maturityAmount = premiumAmount * term * (1 + interestRate / 100);
                        System.out.println("The maturity amount is: " + maturityAmount);
                        break;
                    case 3:
                        System.out.println("Enter policy details:");
                        scanner.nextLine();  // Consume newline left-over
                        String details = scanner.nextLine();
                        System.out.println("Policy Details in Upper Case: " + details.toUpperCase());
                        break;
                    case 4:
                        System.out.println("Enter policy details:");
                        scanner.nextLine();  // Consume newline left-over
                        String detailsLower = scanner.nextLine();
                        System.out.println("Policy Details in Lower Case: " + detailsLower.toLowerCase());
                        break;
                    case 5:
                        System.out.println("Goodbye!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid option. Please enter a number between 1 and 5.");
                }
            }
        }
    }
}