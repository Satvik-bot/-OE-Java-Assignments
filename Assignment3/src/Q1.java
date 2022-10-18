import java.util.Scanner;

public class Q1 {
    static void getAnswer() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String string1 = input.nextLine();
        System.out.println("Enter second string: ");
        String string2 = input.nextLine();

        System.out.println("Comparing string1 and string2");

        int a = Math.min(string2.length(), string1.length());
        int i=0;

        while(i<a){
            if(string1.charAt(i) != string2.charAt(i)){
                System.out.println((int) string1.charAt(i)- string2.charAt(i));
                break;
            }
            i++;
        }
        System.out.println(string1.length() - string2.length());
    }
}
