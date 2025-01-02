//Sum of array elements
//democomment1

/**
 * ArraySum
 */
import java.util.Scanner;
public class ArraySum {

    public static void main(String[] args) {
        int[] arr = new int[5];
        int sum =0;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<arr.length;i++)
        {
            arr[i]= scanner.nextInt();
        }
        for (int i = 0; i<arr.length;i++)
        {
            sum = sum+arr[i];
        }
        System.out.print("SUM OF THE ARRAY IS: "+sum);

        scanner.close();
    }
}