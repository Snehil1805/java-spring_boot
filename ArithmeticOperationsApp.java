import java.util.Scanner;

public class ArithmeticOperationsApp {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            try{
                System.out.println("Enter the first number: ");
                int num1 = s.nextInt();

                System.out.println("Enter the second number: ");
                int num2 = s.nextInt();

                double result = num1 / num2;
                System.out.println("The result is: " + result);
            }
            catch(ArithmeticException ae){
                System.out.println("ERROR: The dividend is zero");
            }
            catch(NumberFormatException ne){
                System.out.println("Error: Invalid number format. Please enter a valid number.");
            }
        }
    

    }
}
