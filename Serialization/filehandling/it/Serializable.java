package filehandling.it;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializable {
    public static void main(String [] args){
        Book fr=new Book(101,"Evil Deadth");
        try{
     FileOutputStream fo=new FileOutputStream("Evil.txt");
       ObjectOutputStream rh=new ObjectOutputStream(fo);
     rh.writeObject(fr);
     rh.close();
     fo.close();
        }catch(Exception e){
        System.out.println("Unidentified file request");
        }
     


}
}
