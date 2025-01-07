/**
 * Palindrom
 */
public class Palindrom {
    public String palindrom(int pNum)
    {
       int pNum1 = pNum;
       int reverse =0;
       int remainder=0;
        while(pNum1!=0)
        {      
            remainder= pNum1 %10; //123
            reverse = remainder + (reverse*10);
            pNum1 = pNum1/10;
        }
        System.out.println(reverse);
        if(pNum==reverse){
            return "yes";
        }
        else{
            return "No";
        }
    }

    public String palindromOfString(String pchar){
        String reverse=" ";
        for (int i=pchar.length()-1;i>=0;i--)
        {
            reverse = reverse+ pchar.charAt(i);
        }
        System.out.println(reverse);
        if(pchar==reverse){
            return "yes";
        }
        else{
            return "No";
        }

    }

    public static void main(String[] args) {
        Palindrom object = new Palindrom();
        System.out.println(object.palindrom(12291));

        System.out.println(object.palindromOfString("GEEK"));
    
    }
}