package Com.company;
import java.lang.Thread;


class Extension1 extends Thread{
   

    void run1(){
        int i=0;
    while(i<100){
        System.out.println("Mihir is good coder");
        i++;
    }
        try{
            Thread.sleep(1000);
            System.out.println("Thread1 is sleeping");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        
    }
}
class Extension2 extends Thread{
    void run2(){
        int j=0;
        while(j<100){
            System.out.println("Ankit is good coder");
            j++;
        }
        try{
            Thread.sleep(2000);
            System.out.println("Thread2 is sleeping");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
       

    }
}
public class Extrension{
    public static void main(String[] args) {
        Extension1 sc=new Extension1();
        sc.run1();
        Extension2 rc=new Extension2();
        rc.run2();
        Thread th1=new Thread(sc);
        th1.start();
        Thread th2=new Thread(rc);
        th2.start();
    }

}
