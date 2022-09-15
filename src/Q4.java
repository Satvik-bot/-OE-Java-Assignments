import java.util.Scanner;

public class Q4 {
    static void getAnswer() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the two numbers you want to swap: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("The numbers after swapping with a temp variable: " + a + " and " + b);


        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("The numbers after swapping without a temp variable: " + a + " and " + b);
    }
}
