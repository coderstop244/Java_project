package mihir.com;
import java.util.Scanner;
abstract class Shape{
abstract void chetrafal();
int a;
int b;
 public Shape(int a,int b){
    super();
        System.out.println("Dimemsions of rectangle :-");
    }
}

class Rectangle extends Shape{
   
    @Override
    public void chetrafal(){
        System.out.println("area of rectangle:-" + a*b);
    }
}
public class Areas {
    public static void main(String []args){
        Rectangle r=new Rectangle();
        r.chetrafal();
        Scanner k=new Scanner(System.in);
        k.nextInt();

    }

}
