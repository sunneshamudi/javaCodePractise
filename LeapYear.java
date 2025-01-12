/**
 * LeapYear
 */
public class LeapYear {
    public String leapyr(int year){
        if(year%4==0 || year%400==0)
        {
           return "yes";
            //System.out.println(year +"is a leap year");
        }
        else
        {
            return "no";
           // System.out.println(year +"is not a leap year");
        }
    }
    public static void main(String[] args) {
        LeapYear object = new LeapYear();
        //object.leapyr(2029);
        System.out.println(object.leapyr(2029));
    }
}