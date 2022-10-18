import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    static void getAnswer() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        countingSort(arr, 20);

        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < n; i++) {
//            System.out.println(i+1 + " : " + arr[i]);
//        }
    }

    public static void countingSort(int[] input, int k){
        int counter[] = new int[k+1];
        int ndx = 0;
        for (int i = 0; i < counter.length; i++) {
            while(0 < counter[i]) {
                input[ndx++] = i;
                counter[i]--;
            }
        }
    }
}
