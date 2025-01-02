abstract class Shape {
    abstract double calculateArea();
    void displayArea() {
        System.out.println("The area is: " + calculateArea());
    }
}
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() throws ArithmeticException{
        double result=0.0;
        try{
            result= 0.5 * base * height;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage()+"error found!");
        }
        finally{
            System.out.println("Execution completed");
        }
        return result;
    }
}
class Square extends Shape{
    private double side;
    public  Square( double side){
        this.side = side;
    }
   @Override
   double calculateArea()
   {
    return side * side;
   }
}
   class Rectangle extends Shape {
    private double lenght;
    private double breadth;
    public  Rectangle( double lenght, double breadth){
        this.lenght = lenght;
        this.breadth = breadth;
    }
   @Override
   double calculateArea() throws NumberFormatException{
   {
    double result=0.0;
    try {
       result= lenght * breadth;
    } catch (NumberFormatException e) {
        System.out.println("Error found!"+e.getMessage());
    }
    return result;
   }
}
}
class Circle extends Shape {
    private double radius;
    private final double PI = 3.14;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        double result=0.0;
        try {
        result =   PI * radius * radius;        
        } catch (Exception e) {
           System.out.println("Error Found! "+e.getMessage());
        }
        return result;
    }
   public static void main(String[] args) {
        
    Triangle triangle = new Triangle(10, 5);
    System.out.println("Triangle:");
    triangle.displayArea(); 

    
    Circle circle = new Circle(7);
    System.out.println("Circle:");
    circle.displayArea();

    Square square = new Square(2);
    System.out.println("Square:");
    square.displayArea();

    Rectangle rectangle = new Rectangle(2,6);
    System.out.println("Rectangle:");
    rectangle.displayArea();
   }
}
