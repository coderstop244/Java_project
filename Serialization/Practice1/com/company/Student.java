package com.company;
import java.io.Serializable;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
//import java.io.ClassNotFoundException;
public class Student implements Serializable {
    private String name;
    private String Address;

    public void setname(String n){
        this.name=n;
    }
    public String getname(){
        return name;
    }
    public void setAddress(String k){
        this.name=k;
    }
    
 public String getAddress(){
        return Address;
    }
    public static void main(String[] args) {
        Student rc=new Student();
        rc.setname("Mihir");
        rc.setAddress("Lucknow");
    
        try { 
            FileOutputStream fi=new FileOutputStream("Student.txt");
            ObjectOutputStream io=new ObjectOutputStream(fi);
            io.writeObject(rc);
            io.close();
            fi.close();
            System.out.println("Serialized file is saved");
             }
             catch(IOException E){
                E.printStackTrace();
             }

        //Deserializalble
        try { 
            FileInputStream fi=new FileInputStream("Student.txt");
            ObjectInputStream io=new ObjectInputStream(fi);
             Student se=(Student)io.readObject();
             io.close();
             fi.close();
         System.out.println(se);
             }
             catch(IOException E){
                E.printStackTrace();
             }           
             catch(ClassNotFoundException e){
                e.printStackTrace();
             }
    }

}
