import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int secretNumber = 15;
        int guess = 0;

        while (guess != secretNumber) {
            System.out.print("Guess the number (1-20): ");
            guess = input.nextInt();

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
            }
        }

        input.close();
    }
}