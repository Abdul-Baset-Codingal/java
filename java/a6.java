import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;
        int number;

        System.out.println("Enter numbers (enter 0 to stop):");

        while (true) {
            number = input.nextInt();

            if (number == 0) {
                break;
            }

            sum += number;
        }

        System.out.println("Total Sum = " + sum);

        input.close();
    }
}