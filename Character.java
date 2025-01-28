/**
 * Character
 */
import java.util.Scanner;
public class Character {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name - ");

        String name = scanner.nextLine();

        char[] array = new char[name.length()];
        System.out.println("The name is :");
        for(int i = 0;i<array.length;i++)
        {
            array[i]= name.charAt(i);
        }
        for(int i = 0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
        scanner.close();
    }
}