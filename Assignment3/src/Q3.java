import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    static void getAnswer(){
        Scanner input = new Scanner(System.in);

        System.out.print("Input string: ");
        String s = input.nextLine();

        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        s = new String(arr);

        System.out.println("Sorted string is:" + arr);
    }
}
