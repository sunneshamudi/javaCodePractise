public class TableCalculation
{
        void tableCalc(int input)
        {
            for(int j=1;j<=input;j++)
            {
                for(int i=1;i<=10;i++)
                {
                    System.out.println(j+" * "+i+" = "+j * i);
                }  
            System.out.println();
            }                  
        }     
        void newtableCalc()  
        {
            int arr[] = new int[20];
            for (int i=0;i<arr.length;i++)
            {
                arr[i]= i;
            }
            for (int i=0;i<arr.length;i++)
            {
                System.out.println(arr[i]+1);
            }
        }  
        public static void main(String[] args)
        {
            TableCalculation tableCalculation=  new TableCalculation();
            tableCalculation.tableCalc(5); 
            tableCalculation.newtableCalc();

        }
}