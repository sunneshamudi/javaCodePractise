// Array Print array in reverse order Copy array in reverse order ie arri[]= 2,4,6,8,10 arr2 should have 10,8,6,4,2 Store Sunnesha in array.

import java.util.Scanner;
public class Array {

    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arr2 = new int[5];
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter elements of array: ");
        for(int i = 0; i<arr.length;i++) //taking input for the array
        {
            arr[i]= scanner.nextInt();
        }
        System.out.println("Our Array is: "); 
        for (int i = 0; i<arr.length;i++) // printing original the array
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println(" ");
        // for (int i = arr.length-1;i >=0;i--)
        // {
        //     System.out.print(arr[i]+",");
        // }
        for (int i = 0; i<arr.length;i++)
        {
           arr2[i]= arr[arr.length-1-i];
        }
        System.out.println(" ");
        System.out.println("Reverse array: ");
        for (int i = 0; i<arr2.length;i++)
        {
            System.out.print(+arr2[i]+ " ");
        }
        System.out.println(" ");
    }
    }   
