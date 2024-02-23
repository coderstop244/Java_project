package com.company;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class File1 {
    public static void main(final String[] args) {
        //creacting a file
/* 
          File rc=new File("Hero.txt");
        try{
        rc.createNewFile();
        System.out.println("New file created");

        }catch(IOException e){
            e.printStackTrace();
*/
    
        //Writing in file
         /*  
        File rb =new File("Hero.txt");
        try{
            FileWriter rk=new FileWriter("Hero.txt");
            rk.write("Java is intresting.");
            rk.close();

        }catch(IOException e){
            e.printStackTrace();
            
        }
         */
        //reading file
           /*  
        File rk =new File("Hero.txt");
        try{
        Scanner k=new Scanner(rk);
        while(k.hasNextLine()){
            String line=k.nextLine();
            System.out.println(line);
        }
    }catch(IOException e){
        e.printStackTrace();
    }
    */
//delete file
File rk=new File("Hero.txt");

if(rk.delete()){
    System.out.println("File has been deleted." +rk);

}else{
    System.out.println("Some probem has occudred.");
}
   
}
}