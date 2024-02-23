package mihir.com;

abstract class Animal{
    abstract public void sound();
}
class Lion extends Animal{
    public void sound(){
        System.out.println("lion roar");
    }
}
class Tiger extends Animal{
    public void sound(){
        System.out.println("Tiger roar");
    }
}
public class Animal1 {
    public static void main(String []args){
        Lion r=new Lion();
        r.sound();

        Tiger k=new Tiger();
        k.sound();
    }

}
