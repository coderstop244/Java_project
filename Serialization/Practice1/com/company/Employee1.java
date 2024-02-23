package com.company;
import java.io.*;
public class Employee1 {
    public static void main(String[] args) {
        
    
    try{
        FileInputStream rc=new FileInputStream("Employee.txt");
        ObjectInputStream rb=new ObjectInputStream(rc);
        rb.close();
        rc.close();
    
    }
    catch(IOException e){
    e.printStackTrace();
    
          }
    }

}
