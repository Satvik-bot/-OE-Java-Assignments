import java.util.Scanner;

public class Q4 {
    static void getAnswer() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = s.nextInt();

        System.out.print("Hailstone Sequence for " + n + " is: ");

        while(n!=1)
        {
            if(n%2==0){
                n=n/2;
                System.out.print(n+" ");
            }
            else if (n%2!=0){
                n=(n*3)+1;
                System.out.print(n+" ");
            }
        }
    }
}
