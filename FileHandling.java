import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

    void createNewFile(File myFile){
        // Creating new file
        try {
			if (myFile.createNewFile()) {
				System.out.println("File created: " + myFile.getAbsolutePath());
			} else {
				System.out.println("File already exists."+ myFile.getAbsolutePath());
			} 
		} catch (IOException e) {
			System.out.println("An error occurred while creating the file.");
			e.printStackTrace();
		}
    }
    void WriteFile(File myFile, String message)
    {
        //Writing in to the File
        try {
            FileWriter myFile2 = new FileWriter (myFile);
            myFile2.write(message);
            System.out.println("Successfully wrote to the file.");
            myFile2.close();        
        } catch (IOException e) {
                System.out.println("An error occurred while writing in the file.");
                e.printStackTrace();
        }
    }
    void read(File myFile)
    {   //Reading File
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
                System.out.println("File read successfully.");
            }
            sc.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
             }
    }
    void deleteFile(File myFile) {
        //deleting
        if(myFile.delete()){
            System.out.println("I have deleted: " + myFile.getAbsolutePath());
        }
        else{
            System.out.println("Some problem occurred while deleting the file");
        }

    }
    public static void main(String[] args) {
		
        String filePath = "/Users/sunneshamudi/Desktop/File_Handling.txt";         
        File myFile = new File(filePath);
        String message = "My name is Sunnesha Mudi.\nWhat's Your Name?";
        FileHandling filehandling = new FileHandling();
        filehandling.createNewFile(myFile);
        filehandling.WriteFile(myFile,message);
        filehandling.read(myFile);
        filehandling.deleteFile(myFile);

    }
}