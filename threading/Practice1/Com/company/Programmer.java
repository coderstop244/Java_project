package Com.company;
import java.lang.Thread;
 class Programmer2 extends Thread{
    
    void pain(){
        try{
            Thread.sleep(1000);
            System.out.println("Thred 2 sleeping.");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        int i=0;
        while(i<10){
System.out.println("Python easier than java");
i++;
        }
        }

        }
    
    class Programmer1 extends Thread{
        
        void pain(){
            try{Thread.sleep(200);
                System.out.println("Thread 1 is sleeping.");
            }catch(InterruptedException e){
                e.printStackTrace();}
                int j=0;

while(j<10){
            System.out.println("Java is more intresting than Python");
            j++;
}
        }
    }
    public class Programmer{
    public static void main(String[] args) {
Programmer1 t1=new Programmer1();
t1.pain();
Programmer2 t2=new Programmer2();
t2.pain();
 Thread th1=new Thread(t1);
 th1.start();
 Thread th2=new Thread(t2);
 th2.start();

        
    }
    }

