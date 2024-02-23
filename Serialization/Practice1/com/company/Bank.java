package com.company;
import java.io.Serializable;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
public class Bank implements Serializable{
    String name;
   transient int Accountno;

    public static void main(String[] args) {
        Bank sc =new Bank();
        sc.name="Mihir";
        sc.Accountno=125055;
        try{
            FileOutputStream rc=new FileOutputStream("Bank.txt");
            ObjectOutputStream rb=new ObjectOutputStream(rc);
            rb.writeObject(sc);
            rb.close();
            rc.close();
            System.out.println("File is seriailzed");
        }catch(IOException e){
            e.printStackTrace();
        }
        
    
    //Desirialize
    try{
        FileInputStream ri=new FileInputStream("Bank.txt");
        ObjectInputStream rk=new ObjectInputStream(ri);
        Bank io=(Bank)rk.readObject();
        rk.close();
        ri.close();
        System.out.println("File is Deserialized");
        System.out.println(io);

    }catch(IOException e){
        e.printStackTrace();
    }catch(ClassNotFoundException k){
        k.printStackTrace();
    }

}
}