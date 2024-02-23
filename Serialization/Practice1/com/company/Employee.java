package com.company;
import java.io.Serializable;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
//import java.io.NotSerializableException;
public class Employee implements Serializable{
    public String name;
    
    public String Address;
    public static void main(String[] args) {
        Employee sc=new Employee();
        sc.name="Mihir";
        sc.Address="Lucknow";
             try { 
            FileOutputStream fi=new FileOutputStream("Employee.txt");
            ObjectOutputStream io=new ObjectOutputStream(fi);
            io.writeObject(sc);
            io.close();
            fi.close();
            System.out.println("Serialized file is saved");
             }
             catch(IOException E){
                E.printStackTrace();
             }
      
    }
}
