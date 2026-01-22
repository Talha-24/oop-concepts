
class Student {

    String name;
    int age;
    int marks;
    String email;
    String city;

    Student() {// non-parametarize
        this.name = "Nouman";
        this.age = 10;
    }

    public void printInformation() {
        System.out.println("Name " + this.name);
        System.out.println("Age " + this.age);
        System.out.println("Marks " + this.marks);
        System.out.println("City " + this.city);
        System.out.println("Email " + this.email);
    }

    Student(String name, int age, String city, int marks, String email) { // parametarized..
        this.name = name;
        this.age = age;
        this.email = email;
        this.marks = marks;
        this.city = city;
    }

    Student(String name) {
        this.name = name;
        this.age = 10;
    }
//  COPY CONSTRUCT
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
        this.city = s.city;
        this.marks = s.marks;
    }

}

public class Nouman {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student param = new Student("Talha", 21, "Lahore", 100, "talha@gmail.com");

        Student student17 = new Student(param);
        student17.name = "Nouman";
        student17.email = "nouman@gmail.com";
        student17.printInformation();
        // Student paramOne = new Student("Zubair");
        // paramOne.printInformation();

    }
}
