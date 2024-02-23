package com.company;
import java.lang.Thread;
public class Extension extends Thread{
    void run1(){
    try{
        Thread.sleep(1000);
        System.out.println("Thread1 Sleeping");
    }catch(InterruptedException e){
        e.printStackTrace();
    }
    int i=0;
    while(i<100){
        System.out.println("Mihir is good in coding");
    }
}
}
public class Extension1 extends Thread{ 
void run1(){try{
    Thread.sleep(2000);
    System.out.println("Thread2 sleeping");
}catch(InterruptedException e){
    e.printStackTrace();
}

int j=0;

while(j<100){
    System.out.println("Ankit is good coder");
}}
  

    public static void main(String[] args) {
        

        
    }

}