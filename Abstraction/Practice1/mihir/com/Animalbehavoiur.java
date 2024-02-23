package mihir.com;

abstract class Animalbehaviour1{
    abstract void eat();
    abstract void sleep();

}

class Lion extends Animalbehaviour1{
    public void eat(){
        System.out.println("They are carnivorous");
    }
    public void sleep(){
        System.out.println("They sleep a lot in winters");
    }
}
class Tiger extends Animalbehaviour1{
    public void eat(){
        System.out.println("They are carnivoros ");
    }
    public void sleep(){
        System.out.println("They sleep less in winters");
    }
}
class Deer extends Animalbehaviour1{
    public void eat(){
        System.out.println("They are omnivorous");
    }
    public void sleep(){
        System.out.println("They sleep less");
    }
}
public class Animalbehavoiur {
    public static void main(String []args){
        Lion r=new Lion();
        r.eat();
        r.sleep();
        Tiger k=new Tiger();
        k.eat();
        k.sleep();
        Deer j=new Deer();
        j.eat();
        j.sleep();


    }
    

}
