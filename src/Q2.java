import java.util.Scanner;

public class Q2 {
    static void getAnswer() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 2 numbers you want to operate on: ");

        float a = input.nextFloat();
        float b = input.nextFloat();
        float product = (a*b);

        System.out.println("Multiplication of " + a + " and " + b + " is: " + product);
        System.out.println("------------------0------------------");
    }
}
