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
            case 5:
                System.out.println("The Answer is: ");
                Q5.getAnswer();
                break;
            case 6:
                System.out.println("The Answer is: ");
                Q6.getAnswer();
                break;
            default:
                System.out.println("Request Denied. Type a number in the range 1-6.");
                break;
        }
    }
}