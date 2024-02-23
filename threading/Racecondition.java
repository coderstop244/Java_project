import java.util.concurrent.SynchronousQueue;

public class Racecondition extends Thread {
     
       synchronized void showData(){
        int sum=0;
            for(int i=1;i<10;i++){
                sum +=i;
                System.out.println(sum);
                   
            }
        }
        Object obj;
        void fun(){
            System.out.println("DO Anything...");
        
        
        synchronized(Racecondition.class){
          
        }

       }
        void tan(){
            System.out.println("Do something");
        }
        public static void main(String[] args) {
            
            System.out.println("Thread ");
              Racecondition re= new Racecondition();
              re.fun();
              re.showData();
              re.tan();
            Thread th1=new Thread(re);
              th1.start();
               
         }
}
