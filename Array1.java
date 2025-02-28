/**
 * Array
 */
public class Array1 {

    void insertion(int data) //data=125
    {   int data1= data;
        int reverse=0;
        int remdata=0;
        int i =0;
        int arr[] = new int[3];
        while(data1!=0)
        {
        remdata= data1%10;
        arr[i]=remdata;
        data1=data1/10;
        i++;
        }
        for(int j=0;j<arr.length;j++)
        {
            System.out.println("array is "+ arr[j]);
        }
        
    }
    public static void main(String[] args) {
        Array1 obj = new Array1();
        obj.insertion(125);
    }
}