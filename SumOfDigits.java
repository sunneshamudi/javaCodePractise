public class SumOfDigits {
    
    public int Digit(int x){
        int sum=0;
        while(x!=0){   
        sum = sum+(x%10);
        x=x/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        SumOfDigits object = new SumOfDigits();
        System.out.println(object.Digit(1291));
    }
}