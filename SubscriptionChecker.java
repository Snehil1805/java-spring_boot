import java.util.Scanner;
public class SubscriptionChecker {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Welcome to the Subscription Checker");
            System.out.println("Enter the number of days left until your subscription ends:");
            int daysLeft = s.nextInt();
            if (daysLeft < 0 || daysLeft > 30){
                System.out.println("Invalid input.Please enter a number between 0 and 30.");
            }else if(daysLeft == 0){
                System.out.println("Your subscription has ended. Please renew.");
            }else if(daysLeft <= 5){
                System.out.println("our subscription is about to end. Please consider renewing.");
            }else{
                System.out.println("our subscription is active.");
            }
        }
        System.out.println("Goodbye!");
    }    
}
