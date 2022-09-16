
/*
1. Write a Java program to print addition and subtraction of two
integer numbers.
2. Write a Java program to print multiplication of two floating
point numbers.
3. Write a Java program to compute quotient and remainder and
print it.
4. Write a Java program to swap the values of integer number
with using temporary variable and without using temporary
variable
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the question number: ");
        int a = input.nextInt();

        switch (a) {
            case 1:
                System.out.println("The Answer is: ");
                Q1.getAnswer();
                break;
            case  2:
                System.out.println("The Answer is: ");
                Q2.getAnswer();
                break;
            case 3:
                System.out.println("The Answer is: ");
                Q3.getAnswer();
                break;
            case 4:
                System.out.println("The Answer is: ");
                Q4.getAnswer();
                break;
            default:
                System.out.println("Request Denied. Type a number in the range 1-4.");
                break;
        }
    }
}