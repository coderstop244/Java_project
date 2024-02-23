package Com.company;
import java.lang.Thread;

 class Producer extends Thread{
    void wat(){
        System.out.println("Stock over of brand new iron man T-shirt.");

        
    }

 }
 class Consumer extends Thread{
    void notif(){
        try{
            Thread.sleep(1000);

        }catch(InterruptedException e){
            e.printStackTrace();
        }
    
    System.out.println("Notify me!");
    }
 }
public class Marketing{    
    public static void main(String[] args) {
    Producer sc=new Producer();
    sc.wat();
    Consumer tc=new Consumer();
    tc.notif();
    Thread th1=new Thread(sc);
    th1.start();
    Thread th2=new Thread(tc);
    th2.start();    
    }

}
