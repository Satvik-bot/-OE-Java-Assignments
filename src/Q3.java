import java.util.Scanner;

public class Q3 {
    static void getAnswer() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Dividend and Divisor you want to operate on: ");

        int divi = input.nextInt();
        int divs = input.nextInt();

        int quo = divi/divs;
        int rem = divi%divs;

        System.out.println("The quotient is: " + (quo));
        System.out.println("The remainder is: " + (rem));
        System.out.println("------------------0------------------");
    }
}
