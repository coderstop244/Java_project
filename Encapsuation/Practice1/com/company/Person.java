package com.company;

public class Person {

private String name;
private int age;
private String country;

public void setName(String n){
    this.name=n;
}
public String getName(){
    return name;
}
public void setCountry(String k){
    this.country=k;
}
public String getCountry(){
    return country;
}
public void setAge(int r){
    this.age=r;
}
public int getAge(){
    return age;
}

public static void main(String[] args) {
    Person sc=new Person();
    sc.setName("Mihir");
    System.out.println(sc.getName());
    sc.setAge(19);
    System.out.println(sc.getAge());
    sc.setCountry("India");
    System.out.println(sc.getCountry());
    
}
}
