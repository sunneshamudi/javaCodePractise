/**
 * ConsecutiveNum
 */
public class ConsecutiveNum {
    public String number(int a,int b,int c) //a=1,b=2,c=3
    {
        int max= Math.max(a,Math.max(b,c));
        int min= Math.min(a,Math.min(b,c));
        int mid= a+b+c - max-min;

        if(max-mid==1 && mid-min==1)
        {
            return "yes";
        }
        return "no";
    }
    public static void main(String[] args) {
        ConsecutiveNum obj=new ConsecutiveNum();
        System.out.println(obj.number(-19,-2,-3));
    }
}