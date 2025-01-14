/**
 * HappyNumber
 */
public class HappyNumber {

    public int happyMethod(int a){
        int a1=a; //13
        int a2=0;
        int rem = 0;

        while(a1>0){
        rem=a1%10; //13%10 , a1=3
        a2 =  (a2+ (rem*rem)); //0+3^2= 9, a2=9 , a2=10
        a1=a1/10; // a1=1
        }
        return a2;
    }
    public static void main(String[] args) {
        HappyNumber object = new HappyNumber();
        int input=97;
        int result =input;
        while(result!=1 && result!=4)
        {
            result= object.happyMethod(result);
        }
        if(result==1)
        {
            System.out.println("Happy Number");
        }
         else
         {
                System.out.println("Unhappy Number");         
         }
    }
}