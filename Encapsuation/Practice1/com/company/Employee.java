package com.company;

public class Employee {

    private int employeeId;
    private String employeeName;
    private String employeeSalary;

    public void setemployeeId(int k){
        this.employeeId=k;

    }
    public int getemployeeId(){
        return employeeId;
    }
     public void setemployeeName(String l){
        this.employeeName=l;

    }
    public String getemployeeName(){
        return employeeName;
    }
     public void setemployeeSlary(String j){
        this.employeeSalary=j;

    }
     public String getemployeeSalary(){
        return employeeSalary;
    }

    public static void main(String[] args) {
        Employee sc=new Employee();
        sc.setemployeeId(420);
        System.out.println(sc.getemployeeId());
        sc.setemployeeName("Vaibhav");
        System.out.println(sc.getemployeeName());
        sc.setemployeeSlary("2 lakh per month");
        System.out.println(sc.getemployeeSalary());
        
    }

}
