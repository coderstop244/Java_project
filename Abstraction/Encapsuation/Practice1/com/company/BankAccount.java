package com.company;

public class BankAccount {

    private int accountNumber;
    private int balance;
  
    public void setaccountNumber(int n){
        this.accountNumber=n;
    }
    public int getaccountNumber(){
        return accountNumber;

    }
    public void setBalance(int k){
        this.balance=k;
    }
    public int getBalance(){
        return balance;
    }
    public static void main(String[] args) {
        BankAccount sc=new BankAccount();
        sc.setaccountNumber(125454454);
        System.out.println(sc.getaccountNumber());
        sc.setBalance(10000000);
        System.out.println(sc.getBalance());

}
}