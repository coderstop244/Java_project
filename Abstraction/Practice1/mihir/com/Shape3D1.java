package mihir.com;


abstract class Shape3D{
    abstract void calculateVolume();
    abstract void calculateSurfaceArea();
}
class Sphere extends Shape3D{
    public void calculateVolume(){
        System.out.println("1/3pi r cube");
    }
    public void calculateSurfaceArea(){
        System.out.println("4pir square");
    }
}
class Cube extends Shape3D{
    public void calculateVolume(){
        System.out.println("r cube");
    }
    public void calculateSurfaceArea(){
        System.out.println("6r square");
    }
}

public class Shape3D1 {
    public static void main(String[]args){

        Shape3D r =new Sphere();
        r.calculateVolume();
        r.calculateVolume();
        Cube k=new Cube();
        k.calculateVolume();
        k.calculateVolume();
    }

}
