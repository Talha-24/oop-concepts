
class Animal {
    String name = "Animal";

    public void walk() {
        System.out.println(name);
        System.out.println("animals walk");

    }
}

class Horse extends Animal {
    public void walk() {
        this.name = "Horse";
        System.out.println(this.name);
        System.out.println("Horse runs on 4 legs");
    }
}

class Hen extends Animal {
    public void walk() {
        this.name = "Hen";
        System.out.println(this.name);
        System.out.println("Hen walks on 2 legs");
    }
}

abstract class Vehicle {
    Vehicle() {
        System.out.println("Vehicle (Parent)");
    }
}

class Motorcycle extends Vehicle {
    Motorcycle() {
        System.out.println("Motorcyle (Child,Sibling_one)");
    }
}

class CD extends Motorcycle {
    CD() {
        System.out.println("CD ");
    }
}

class YM extends Motorcycle {
    YM() {
        System.out.println("YM");

    }
}

interface Human {
    int gender = 18 | 22 | 20;
    int age = 18;

    void eat();

}

interface Foody {
    void eats();

}

class Talha implements Human, Foody {
    public void eat() {
        System.out.println("Mohammad Talha Bhatti");
    }

    public void eats() {
        System.out.println("Mohamamd Talha Eats More Food");
    }
    //
}

// As you noticed, when i have created the object from YM, it has first called
// its top parent's constructor, then its parent's contructor and then it's own
// constructor has been called. This process is called constructor chaining...
class Car extends Vehicle {
    Car() {
        System.out.println("Car (Child2,sibling_two)");
    }
}

class Student {
    public String name;
    static String school = "BFC";
    public void printDetails(){
        System.out.println(this.name);
        System.out.println(Student.school);
    }
}

public class Abatraction {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name="Talha";



    }
}

// We don't need the Animal Class because we don't have to create any specific
// object on the basis of Animal
// So I will use the abstract keyword with that class, because the class no
// longer required, but exists in nature(In english abstract means something
// which does not exists physically, but it is.);
