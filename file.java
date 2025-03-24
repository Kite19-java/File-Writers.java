package filewriter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class file {

 
    public static void main(String[] args) throws  IOException{
        
        Scanner s = new Scanner (System.in);
        
        String path = "C:\\Users\\Win_10\\Desktop\\Textfile.dat";
        System.out.println("---------------------------------------");
        System.out.print("write what you want hehhe: ");
        
      String hi = s.nextLine();
        
       
        
        try( FileWriter input = new FileWriter(path);){
        input.write(hi);
            System.out.println("\n---------------------------------------");
            System.out.println("\nFile has been created");
         
        }catch(FileNotFoundException e){
            System.out.println("No File Path Found talaga Sorry");
            
        }catch (IOException e) {
            System.out.println("Error");
        }finally {
            
            System.out.println("""
                               Display Success
                               """);
            
        
        }try(  BufferedReader see = new BufferedReader(new FileReader(path))) {
      String look;
      while ((look = see.readLine()) !=null){
          System.out.println("---------------------------------------");
          System.out.println("\nInside of the file:   "+look);
      }
        
        }catch (IOException e) {
        System.out.println("Hindi makita yung file sorry");
        }
        
        }
    }
    

