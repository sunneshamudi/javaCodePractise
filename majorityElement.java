import java.util.Scanner;

public class majorityElement {
    static int[] arr = new int[7];
        static void majorCount( ){
            int major=0;
            int maxcount=0;
           // int[] arr = new int[5];
            for (int i=0;i<arr.length;i++)
            {   
                int count =0;
                for(int j=0;j<arr.length;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        count++;
                       // System.out.println("count is:"+count);
                    }
                    if(count>=maxcount)
                    {
                        maxcount=count;
                        major=arr[i];
                    }
                }
            }
           // System.out.println("No of duplication is: "+maxcount);    
            System.out.println(major + " is duplicating "+ maxcount + " times." ); 
       // return major;    
        }
        public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Elements : ");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Array elements are:");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.println();
        sc.close();
        majorCount();
       // System.out.println("Majority element is: "+majorCount());    
    }
}