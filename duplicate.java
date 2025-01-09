//Find duplicate elements
import java.util.Scanner;
public class duplicate {

    public static boolean duplicateFind(int arr[])
    {
        int flag=0;
        System.out.println("Duplicates are:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                    countOccurrences(arr,arr[j]);
                    flag=1;
                }
            }
        }
        if (flag==1)
        return true;
        else
        return false;
    }
    //Count occurrences of an element
    public static void countOccurrences(int[] array, int element) {
        int count = 0;
        for (int num : array) {
            if (num == element) {
                count++;
            }
        }
        System.out.println("No of Occurance:"+count);
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<arr.length;i++)
        {
            arr[i]= scanner.nextInt();
        }
        System.out.println("Has duplicates: " + duplicateFind(arr));
      //  int elementToCount = scanner.nextInt();
       // System.out.println("Occurrences of " + elementToCount + ": " + countOccurrences(arr, elementToCount));
        scanner.close();
    }
}