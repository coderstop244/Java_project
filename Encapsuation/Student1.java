import java.util.Scanner;

class Student{
    String name;
    int age;

void StudentInfo(){
    System.out.println(this.name);
    System.out.println(this.age);

}
//copy constructor
Student(Student s2){
    this.name= s2.name;
    this.age=s2.age;
}
//we added empty constructor so copiler can recognize parametric one
Student(){

}
}


    public class Student1{
        public static void main(String[] args){
            Student s1=new Student();
            s1.name="Mihir";
            s1.age=19;
            Student s2=new  Student(s1);
            s1.StudentInfo();

        }
    }
    



    


