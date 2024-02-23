package mihir.com;

abstract class Account{
    abstract void deposit();
    abstract void withdraw();
}
class SavingAccount{
    public void deposit(){
        System.out.println("You have successfully deposited money in ur saving account");
    }
    public void withdraw(){
        System.out.println("You have successfully withdrawled money from ur saving account");

    }

}
class CurrentAccount{
    public void deposit(){
        System.out.println("You have successfully deposited money in ur current account");
    }
    public void withdraw(){
        System.out.println("You have successfully withdrawled money from ur current account");
    }
}
public class Account1 {

    public static void main(String[]args){

        SavingAccount r=new SavingAccount();
        r.deposit();
        r.withdraw();
        CurrentAccount k=new CurrentAccount();
        k.deposit();
        k.withdraw();
    }

}
