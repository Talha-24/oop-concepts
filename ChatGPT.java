
import packages.bank.*;
class Car{
   int year=2022;
   String brand="Corolla";
   Car(String brand,int year){
    this.brand=brand;
    this.year=year;
    System.out.println("name : " + this.brand);
    System.out.println("year : "+this.year);
   }
   Car(Car c){
    this.brand=c.brand;
    this.year=c.year;
   }
   Car(){
    System.out.println("Brand : " + this.brand);
    System.out.println("Year : "+ this.year);
   }
}


class Person{
    String name;
    String age;

    Person(String name,String age){
        this.name=name;
        this.age=age;
    }
    Person(){}


    public void display(){
        System.out.println("name : " + this.name);
        System.out.println("age : " + this.age);
    }
}

class Employee extends Person{
    String employeeID;

    Employee (String name,String age,String employeeID){
        this.name=name;
        this.age=age;
        this.employeeID=employeeID;
    }

    public void display(){
        System.out.println("name : " + this.name);
        System.out.println("age : " + this.age);
        System.out.println("Employee ID : " + this.employeeID);
    }
    Employee(){}


}
class Manager extends Employee{
    String ProjectLead;

    Manager(String name,String age, String employeeId,String ProjectLead){
        this.name=name;
        this.age=age;
        this.employeeID=employeeId;
        this.ProjectLead=ProjectLead;
    }

    public void display(){
        System.out.println("name : " + this.name);
        System.out.println("age : " + this.age);
        System.out.println("Employee ID : " + this.employeeID);
        System.out.println("Project Lead : " + this.ProjectLead);
    }
}


class Shape{
}

class Square extends Shape{
    int l;
    int w;
}

class Circle extends Shape{
    int r;

}
class SHAPECLASS{
    public void ArrayFNS(){
        // Shape[] Talha={}

    }
}

class Student{
    String name;
    int age;
    int marks;

    Student(String name,int age, int marks){
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
    Student(Student S){
        this.name=S.name;
        this.age=S.age;
        this.marks=S.marks;
    }

    public void PrintDetails(){
        System.out.println("name : "+ this.name);
        System.out.println("age : "+this.age);
        System.out.println("marks : "+this.marks);
    }
}




public class ChatGPT {

    public static void main(String[] args){
        // Car Car1=new Car();
        Student s1=new Student("Mohammad Talha",20,500);
        Student s2=new Student(s1);
        s1.name="Ali";
        s1.age=18;
        s1.marks=424;
        System.out.println("Student ONE ");
        s1.PrintDetails();
        System.out.println("Student TWO");
        s2.PrintDetails();
    }
}