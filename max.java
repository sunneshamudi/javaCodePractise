//5 4 7 3 8
// max =a[0]; -5
//for(i=0)-> if a[i]>max -> max=a[i]
// 
import java.util.Scanner;
public class max {

    public static void main(String[] args) {
        int[] arr = new int[5];
        int max =arr[0];
        int min= arr[0];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<arr.length;i++)
        {
            arr[i]= scanner.nextInt();
        }
        for (int i = 1; i<arr.length;i++)
        {
           if(max<arr[i])
           {
                max= arr[i];
           }
        }
        System.out.println("Max Number Is: "+max);

        for (int i = 1; i<arr.length;i++)
        {
           if(min>arr[i])
           {
                min= arr[i];
           }
        }
        System.out.println("Min Number Is: "+min);
        scanner.close();
    }
}
//Input- 12 45 1 78 0