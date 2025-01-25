class emplyee{

   public void printEmplyeeDetails(int id,String name,String designation,int salary){
    System.out.println("Employee details are"+ id+name+designation + salary);
}
public static void main(String[] args) {
   emplyee obj = new emplyee();
   obj.printEmplyeeDetails(1,"Sunnesha","QA",10);
}
}