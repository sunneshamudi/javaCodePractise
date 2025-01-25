class Avg{
    public double AverageNum(int a, int b, int c, int d, int e){
        return (a+b+c+d+e)/5;
    }
    public static void main(String[] args) {
        Avg obj = new Avg();        
        System.out.println(obj.AverageNum(11,200,33,29,110));
    }
}