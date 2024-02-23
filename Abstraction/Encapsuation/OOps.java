class Pen{
    String color;
    String type;

    //method
    public void write(){
        System.out.println("write something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
    class Student{
        String name;
        int age;
    }.
    public void studentinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    
}
public class OOps{
    public static void main(String args[]){
        Student s1=new Student();
        s1.name ="Mihir";
        s1.age ="19";

        s1.studentInfo();

    }
}
