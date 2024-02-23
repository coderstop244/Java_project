package com.company;

public class Car {
    private String companyName;
    private String modelName;
    private int modelYear;
    private double constant;

    public void setcompanyName(String l){
        this.companyName=l;
    }
    public String getcompanyName(){
        return companyName;
    }
     public void setmodelName(String k){
        this.modelName=k;
    }
    public String getmodelName(){
        return modelName;
    }
    public void setmodelYear(int j){
        this.modelYear=j;
    }

    public int getmodelYear(){
        return modelYear;
    }
public void setconstant(double u){
        this.constant=u;
    }

public double getconstant(){
        return constant;
    }
    public double calculateMilege(){
        return Math.PI*constant;
    }
    public static void main(String[] args) {
        Car sc=new Car();
        sc.setcompanyName("Ford");
        String companyName=sc.getcompanyName();
        sc.setmodelName("Mustang");
        String modelName=sc.getmodelName();
        sc.setmodelYear(1985);
        int modelYear=sc.getmodelYear();
        sc.setconstant(7.4);
        double constant=sc.getconstant();
        double calculateMilege=sc.calculateMilege();

        System.out.println("Car company:- " +companyName);
        System.out.println("Car model:- " +modelName);
        System.out.println("Model Year:- " +modelYear);
        System.out.println("Constant of milege(Model dependent):- " +constant);
        System.out.println("Milege of car in km/l:- " +calculateMilege);
        
    }
}
