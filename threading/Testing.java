public class Testing implements Runnable {

    public void run(){
            System.out.println("Test class run method");
           for(int a=0;a<=10;a++){
                 System.out.println("the name thread:-"+a);
               try {
                 Thread.sleep(1000);
               } catch (InterruptedException e) {
                
                   System.out.println("intrruption");
               }
           }
        }
  public static void main(String[] args) {
         Testing r=new Testing();
           // r.run();
         Thread th1=new Thread(r);
         Thread th2=new Thread(r);
         th1.start();
         th2.start();
           
    }
}
   
