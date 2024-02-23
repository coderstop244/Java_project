package Com.company;
import java.lang.Thread;

class Increment1 extends Thread{
    void red(){
        try{
            Thread.sleep(1000);
            System.out.println("Sleeping");
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    int i=0;
    while(i<100){
        System.out.println("Java is best");
i++;
    }
    }
   }

class Increment2 extends Thread{
    void red(){
        try{
            Thread.sleep(1000);
            System.out.println("Sleeping");
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    int j=100;
    while(j<200){
        System.out.println("Python easier than Python");
         j++;
    }
    
}
}
public class Increment{
    public static void main(String[] args) {
        Increment1 t1=new Increment1();
        t1.red();
        Increment2 t2=new Increment2();
        t2.red();

        Thread th1=new Thread(t1);
        th1.start();
        Thread th2=new Thread(t2);
        th2.start();
        
    }
}

