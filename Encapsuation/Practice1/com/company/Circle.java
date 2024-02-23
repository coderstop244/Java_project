package com.company;

public class Circle {
    private double radius;

    public void setradius(double k){
        this.radius=k;
    }
    public double getradius(){
        return radius;
    }
    public double calculateArea(){
        return Math.PI * radius*radius;
    }
public double calculateParameter(){
    return  2 * Math.PI * radius;
}
    public static void main(String[] args) {
        Circle sc=new Circle();
        sc.setradius(7);
        double radius=sc.getradius();

        double area=sc.calculateArea();
        double parameter=sc.calculateParameter();
        System.out.println("circle radius:- " + radius);
        System.out.println("circle area:- " +area);
        System.out.println("circle parameter:- " +parameter);
        
    }

}
