package com.company;
import java.io.*;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.NotSerializableException;
import java.io.FileNotFoundException;
public class Student1 extends Student{
    public static void main(String[] args) {
        File ReadFile=new File("Student.txt");
        try{
            FileInputStream ig=new FileInputStream("Student");
            ObjectInputStream ib=new ObjectInputStream(ig);
            Student e=(Student) ib.readObject();
            System.out.println("Desialised name:- " +e.getname());
            System.out.println("Deselised address:- " +e.getAddress()  );
            ib.close();
        }
            catch(IOException e){
                e.printStackTrace();
            }
            catch(ClassNotFoundException e){
                e.printStackTrace();
            }

        } 

        
    }


