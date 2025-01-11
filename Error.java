public class Error {
    public static int divide(int a ,int b)throws ArithmeticException{
        int c=0;
        try {
            c=a/b;
        } catch (ArithmeticException e) {
            System.out.println("Error occurred !"+e.getMessage());
        }
        return c;
    }
    
    public static void main(String[] args) {
        int result = 0;
        result= divide(10, 0);
        System.out.println(result);
    }
}