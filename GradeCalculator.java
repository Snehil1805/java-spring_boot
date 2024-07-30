import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Grade Calculator!");

        int score = getScore(scanner);

        if (score != -1) {

            char grade = calculateGrade(score);

            System.out.println("Your grade is: " + grade);

        }

        System.out.println("Goodbye!");

    }


    public static int getScore(Scanner scanner) {

        System.out.print("Please enter your score (0-100): ");

        int score = scanner.nextInt();

        if (score < 0 || score > 100) {

            System.out.println("Error: Invalid score. Score must be between 0 and 100.");

            return -1;

        }

        return score;

    }


    public static char calculateGrade(int score) {

        if (score >= 90 && score <= 100) {

            return 'A';

        } else if (score >= 80 && score < 90) {

            return 'B';

        } else if (score >= 70 && score < 80) {

            return 'C';

        } else if (score >= 60 && score < 70) {

            return 'D';

        } else {

            return 'F';

        }

    }

}
