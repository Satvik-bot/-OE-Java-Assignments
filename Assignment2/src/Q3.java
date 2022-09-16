import java.util.Scanner;

public class Q3 {
    static void getAnswer(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month number: ");
        int month = input.nextInt();

        switch (month) {
            case 1:
                System.out.println("The month is January and number of days are: 31");
            case 2:
                System.out.println("The month is February and number of days are: 28");
            case 3:
                System.out.println("The month is March and number of days are: 31");
            case 4:
                System.out.println("The month is April and number of days are: 30");
            case 5:
                System.out.println("The month is May and number of days are: 31");
            case 6:
                System.out.println("The month is June and number of days are: 30");
            case 7:
                System.out.println("The month is July and number of days are: 31");
            case 8:
                System.out.println("The month is August and number of days are: 31");
            case 9:
                System.out.println("The month is September and number of days are: 30");
            case 10:
                System.out.println("The month is October and number of days are: 31");
            case 11:
                System.out.println("The month is November and number of days are: 30");
            case 12:
                System.out.println("The month is December and number of days are: 31");
        }
    }
}
