public class threading{
    public static void main(String[] args) {
        Mythread tr=new Mythread();
        tr.start();
        Mythread1 t1=new Mythread1();
        t1.start();
    }
}
 class Mythread extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<10){
        System.out.println("Shivank will ditch Khushi");
        i++;
        }
       
    }

   }  
 class Mythread1 extends Thread{
    
    public void run(){
        int sum=0;
        while(i<10){
        System.out.println("");
        sum +=i;
        }
     
    
}
 }