package com.company;

public class Cylinder {
    private double radius;
    private double height;
    
    public void setradius(double n){
        this.radius=n;
    }
    public double getradius(){
        return radius;
    }
    public void setheight(double k) {
        this.height=k;
    }
    public double getheight(){
        return height;
    }
    public double getcalculateVolume(){
        return Math.PI*radius*radius*height;
    }
    public static void main(String[] args) {
        Cylinder sc=new Cylinder();
        sc.setradius(5);
        double radius=sc.getradius();
        sc.setheight(2);
        double height=sc.getheight();
        double calculateVolume=sc.getcalculateVolume();
        System.out.println("Radius given:- " +radius);
        System.out.println("Height given:- " +height);
        System.out.println("Volume of cylinder:- " +calculateVolume);
        
    }

}
