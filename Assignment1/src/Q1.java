import java.util.Scanner;

public class Q1 {
    static void getAnswer() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 2 numbers you want to operate on: ");
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("Addition of " + a + " and " + b + " is: " + (a+b));
        System.out.println("Subtraction of " + a + " and " + b + " is: " + (a-b));
        System.out.println("------------------0------------------");
    }
}
