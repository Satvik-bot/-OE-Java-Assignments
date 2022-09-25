import java.util.Scanner;

public class Q2 {
    static void getAnswer() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input first number:");
        double number1 = sc.nextDouble();

        System.out.println("Input second number:");
        double number2 = sc.nextDouble();

        System.out.println("Input third number:");
        double number3 = sc.nextDouble();

        double smallestNumber;

        if (number1 < number2 && number1 < number3) {
            smallestNumber = number1;
        }

        else if (number2 < number1 && number2 < number3) {
            smallestNumber = number2;
        }

        else {
            smallestNumber = number3;
        }

        System.out.println("Smallest Number: " + smallestNumber);
    }
}
