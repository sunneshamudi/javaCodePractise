

public class EvenNumberOfADigit {
    public String EvenNum(int a)
    {
        while(a!=0){
        int x=a%10;
        if(x%2 !=0)
        {
            return "F";
        }       
        a=a/10;
        }
    return "T";
    }
    public static void main(String[] args) {
        EvenNumberOfADigit object = new EvenNumberOfADigit();       
        System.out.println(object.EvenNum(88));
    }
}