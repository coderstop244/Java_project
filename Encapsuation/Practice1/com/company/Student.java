package com.company;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private int studentId;
    private String studentName;
    private List <Double> grades;

    public void setstudentId(int k){
        this.studentId=k;
    }
    public int getstudentId(){
        return studentId;
    }
     public void setstudentName(String j){
        this.studentName=j;
    }
    public String getstudentName(){
        return studentName;
    }
    public List < Double> getGrades(){
        return grades;
    }
    public void addGrade(double grade){
        if (grades==null){
            grades = new ArrayList<> ();
        }
        grades.add(grade);
    }
    public static void main(String[] args) {
        Student sc=new Student();
        sc.setstudentId(990);
        sc.setstudentName("Mihir");

        sc.addGrade(92.5);
        sc.addGrade(98.5);
        sc.addGrade(97.5);

        int studentId=sc.getstudentId();
        String studentName=sc.getstudentName();
        List <Double> grades=sc.getGrades();

        System.out.println("Student id of the student:- " +studentId);
        System.out.println("Student name:- " +studentName);
        System.out.println("Grade of the student:- " +grades);

        
    }

}
