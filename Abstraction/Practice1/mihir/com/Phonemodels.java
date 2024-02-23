package mihir.com;

abstract class Ringtones{
    abstract public void ringbell();
    abstract public void ui();
    
}

 class Realme extends Ringtones{
@Override
    public void ringbell(){
        System.out.println("Ringtone of realme is:-");
        System.out.println("ji ji");

    }
    @Override
    public void ui(){
        System.out.println("UI of realme is :-");
        System.out.println("dongle");
    }

}
class Samsung extends Ringtones{
    
    @Override
    public void ringbell(){
    System.out.println("Ringtone of Samsung is:-");
        System.out.println("hi hi");
    }
    @Override
    public void ui(){
        System.out.println("UI of Samsung is :-");
        System.out.println("deep mind");
    }

}
class Phonemodels{
public static void main(String[]args){

    Realme r=new Realme();
    r.ringbell();
    r.ui();
    Samsung k=new Samsung();
    k.ringbell();
    k.ui();

}
}
