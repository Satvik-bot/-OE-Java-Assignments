import java.util.Scanner;

public class Q1 {
    static void getAnswer() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter score: ");
        double score = input.nextDouble();

        if (score > 80.0 && score < 90.0) {
            score += 5.0;
            System.out.println("Final score is updated to: " + score);
        }

        System.out.println("The final score remains: " + score);
    }
}
