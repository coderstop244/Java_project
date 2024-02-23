package mihir.com;


abstract class Employee{
    abstract  void calculateSalary();
    abstract void displayinfo();

}
class Manager extends Employee{
    public void calculateSalary(){
            System.out.println("200000/month");
    }
    public void displayinfo(){
        System.out.println("Manager's salary is 24 lakhs/annum");
    }
}
class Programmer extends Employee{
    public void calculateSalary(){
        System.out.println("50000/month");
    }
    public void displayinfo(){
        System.out.println("Programmer's salary is 6 lakhs/annum");
    }
}
public class Employee1 {
    public static void main(String[]args){

        Manager r=new Manager();
        r.calculateSalary();
        r.displayinfo();
        Programmer k=new Programmer();
        k.calculateSalary();
        k.displayinfo();
    }

}
