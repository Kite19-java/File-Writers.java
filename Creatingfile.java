package creatingfile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Creatingfile {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       
       
        System.out.print("Enter the file name that you want: ");
        input.nextLine();
       
      File file = new File("C:\\Users\\Win_10\\Desktop\\"+input);
        System.out.println("The File has been Created");
        
       
       try(FileWriter sulat = new FileWriter(file)){
           
           System.out.println("Write Anything: ");
           String inputs = input.next();
           sulat.write(inputs);
   
       
         
       }catch(IOException e){
           System.out.println("Error file");
       }finally{
           System.out.println("Success File Creation");
       }
    }
    
}
