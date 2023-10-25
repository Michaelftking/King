import java.io.*;
import java.util.*;

public class filehandlingOOP {
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args){
        
        while(true){
            System.out.println("[1] Create");
            System.out.println("[2] Search");
            System.out.println("[3] Delete");
            System.out.println("[4] Exit");
            
            int select = 0;
            if(input.hasNextInt()){
                select = input.nextInt();
                input.nextLine();
            }else{
                input.nextLine();
                System.out.println("Invalid input.");
            }
            
            switch(select){
                case 1:{
                    create();
                    break;
                }
                case 2:{
                    search();
                    break;
                }
                case 3:{
                    delete();
                    break;
                }
                case 4:{
                    System.out.println("Program finished...");
                    System.exit(0);
                    break;
                }default:
            }
        }
    }
    
    public static void create(){
        System.out.println("\t\tCreate file \n");
        
        try{
           System.out.print("Enter filename: ");
           String filename = input.nextLine();
           
           System.out.print("Enter the content of the file: ");
           String content = input.nextLine();
           
           File file = new File(filename);
           FileWriter writer = new FileWriter(file);
           writer.write(content);
           writer.close();
           System.out.println("File create successfully.");
       }catch(IOException e){
           e.printStackTrace();
       }
    }
    public static void search(){
        System.out.println("\t\tSearch file \n");
        
        try{
           System.out.print("Enter the filename to search: ");
           String filename = input.nextLine();
           
           File file = new File(filename);
           
           if(file.exists()){
               BufferedReader read = new BufferedReader(new FileReader(file));
               
               String line;
               System.out.println("File contents: ");
               while((line = read.readLine()) != null){
                   System.out.println(line);
               }
               read.close();
           }else{
               System.out.println("File not found.");
           }
            
       }catch(IOException e){
           e.printStackTrace();
       }
    }
    public static void delete(){
        System.out.println("\t\tDelete file \n");
        
        try{
            System.out.print("Enter filename you want to delete: ");
            String delete = input.nextLine();
            File file = new File(delete);

            if(file.exists()){
                if(file.delete()){
                    System.out.println("File deleted successfully.");
                }else{
                    System.out.println("Failed to delete file.");
                }
            }else{
                System.out.println("File not found.");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}