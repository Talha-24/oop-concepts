package bank;


class Account{
    public  String name; //Can be assible in other classs/files as well
    String age; //Can't be assible in other files
    protected String salary; //only accessible in current file and others files subclases
    private int password; //only accessible in current class

    public int getPassword(){
        setPassword();
        return this.password;
    }

    public void setPassword(){
        int password=(int)(Math.random() * 10000000);
        this.password=password;
    }

    // Account(String name,String age, String salary,int password){
    //     this.password=password;
    // }


}
public class Bank{

    public static void main(String[] args){

        
    }
    
} 