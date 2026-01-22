import bank;
class Student {
    String name;
    String age;
    boolean isTopper;
    String Section;
    String Class;

    Student(String name, String age, String Class, String Section, boolean isTopper) {
        this.name = name;
        this.age = age;
        this.isTopper = false;
        this.Class = Class;
        this.Section = Section;
    }

    public void printInforMation() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("Class : " + this.Class);
        System.out.println("Section : " + this.Section);
        System.out.println("Topper : " + this.isTopper);
    }

    Student() {
    }

}

class Tenth extends Student {
}

class Ninth extends Student {

}

class TestClass {
    String consistency;
    String focus;
    String determination;
    String selfDevelopment;

    TestClass(String consistency, String focus, String determination, String selfDevelopment) {
        this.consistency = consistency;
        this.focus = focus;
        this.determination = determination;
        this.selfDevelopment = selfDevelopment;
    }

    TestClass(TestClass obj) {
        this.consistency = obj.consistency;
        this.determination = obj.determination;
        this.selfDevelopment = obj.selfDevelopment;
        this.focus = obj.focus;
    }

    public void printDetails() {
        System.out.println(this.consistency);
        System.out.println(this.focus);
        System.out.println(this.determination);
        System.out.println(this.selfDevelopment);
    }

}


class AC{
    String name;
    String max;
    String min;
    String price;

    AC(String name,String max,String min,String price){ // parametarize constructo
        this.name=name;
        this.max=max;
        this.min=min;
        this.price=price;
    }

    AC(AC CA){
        this.name=CA.name;
        this.price=CA.price;
        this.min=CA.min;
        this.max=CA.max;
    } // Copy constructors

    public void PrintInformation(){
        System.out.println(this.name);
        System.out.println(this.price);
        System.out.println(this.max);
        System.out.println(this.min);
    }


}






public class Main {

    public static void main(String[] args) {
        // Tenth Talha = new Tenth();
        // Talha.printInforMation();
        // Talha.Section = "Jinnah";
        // Talha.age = "22";
        // Talha.isTopper = false;
        // Talha.name = "Talha";
        // Talha.printInforMation();

        // TestClass testStudent = new TestClass("work", "hard", "success", "comes");
        // TestClass testStudent2 = new TestClass(testStudent);
        // System.out.println("obj one");
        // testStudent.printDetails();
        // System.out.println("obj two");
        // testStudent2.printDetails();
      /*    AC RaoufAC=new AC("Haier","-10","120","400000K");
         AC KamranAC=new AC("PLZ","-18","150","40");
         AC TalhaAC=new AC(RaoufAC);
         AC AliAC=new AC(KamranAC);
        //  
        System.out.println("Grop One");
         RaoufAC.PrintInformation();
         TalhaAC.PrintInformation();
         System.out.println("Group Two");
         KamranAC.PrintInformation();
         AliAC.PrintInformation();*/





         

















    }

}