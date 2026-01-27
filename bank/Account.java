package bank;

public class Account {

    //Default // private // public //protected
    private String name; //default 
    public int age;
    protected int passsword;

    Account(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    //Constructors
    // Methods

    public void displayInfo() {
        System.out.println("Name " + this.name);
        System.out.println("Age " + this.age);
    }

}

class Bank extends Account {

    Bank(String name, int age) {
        super(name, age);

        this.passsword = 429875;
    }

}
