package mihir.com;

abstract class Shape1{
    abstract void calculateVolume();
    abstract void calculateArea();

}
class Rectangle extends Shape1{
    void calculateArea(){
        System.out.println("Formula for area of rectangle:-l*b");
    }
    void calculateVolume(){
        System.out.println("Formula for volume of rectangle:-l*b*h");
    }
}
public class Shape {
    
    public static void main(String[] args) {
        Rectangle sc=new Rectangle();
        sc.calculateArea();
        sc.calculateVolume();
        
    }

}
