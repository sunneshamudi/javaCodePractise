/**
 * SimpleInterest
 */
public class SimpleInterest {

    int calculation(int p,int r, int t)
    {  
       int i= (p*r*t) / 100;      
        return i;
    }
    public static void main(String[] args) {
        SimpleInterest obj = new SimpleInterest();
        System.out.println(obj.calculation(1000, 6, 5));
    }
}