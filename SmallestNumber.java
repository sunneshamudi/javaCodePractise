//Write a Program to find the smallest number among three numbers.

class SmallestNum{

public void smallNum(int a,int b,int c){
    if(a<b & a<c)
        System.out.println(a);
    else if(b<a & b<c)
        System.out.println(b);
    else
        System.out.println(c);
    }
    public int smallNumReturn(int a,int b,int c){
        if(a<b & a<c)
            return(a);
        else if(b<a & b<c)
            return(b);
        else
            return(c);           
        }
    public int smallNumMath(int a,int b,int c){
       // int minAB = Math.min(a,b);
        return Math.min(Math.min(a,b),c);
    }
    
public static void main (String args[])
{
    SmallestNum obj = new SmallestNum();
    obj.smallNum(12,14,13);

    int output= obj.smallNumReturn(1,7,0);
    System.out.println(output);

   // int output2 = obj.smallNumMath(6,89,2);
    System.out.println(obj.smallNumMath(6,89,2));

}
}