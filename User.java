
import java.util.ArrayList;

public abstract class User{
    private String username;
    private String password;
    //private paymentOption paymentOption;
    private String emailAddress;
    private int phoneNr;
    private ArrayList<String> blocked;
    private String gender;
    private int age;

    public User(String username, String password, String emailAddress, int phoneNr, String gender, int age){
        this.username = username;
        this.password = password;
        this.emailAddress = emailAddress;
        this.phoneNr = phoneNr;
        this.gender = gender;
        this.age = age;
    }

    public void blockUser(String user){
        this.blocked.add(user);
    }

    public void report(String User, String reportDescription){
        //send to police
        new Report(this.username, User, reportDescription);
    }


}