import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A78_File_Handling {
    public static void main(String[] args) {
        // Code to create a new file 
        /*
        File myfile = new File("cwh11file.txt");
        try{
            myfile.createNewFile();
        }
        catch(IOException e){
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }
        */

        // Code to write to a file 
        /* 
        try{
            FileWriter myFileWriter = new FileWriter("cwh11file.txt");
            myFileWriter.write("This is our first file from this java course\nOk bye");
            myFileWriter.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        */

        // Reading a file 
        /* 
         File myFile = new File("file78.txt");
         try{
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
         }
         catch(FileNotFoundException e){
            e.printStackTrace();
         }
         */

        //  Deleting a file 
        
         File myFile = new File("cwh11file.txt");
         if(myFile.delete()){
            System.out.println("The file has been deleted successfully.");
         }
         else{
            System.out.println("Failed to delete the file.");
         }

    }
}
