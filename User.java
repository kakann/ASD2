
import java.util.ArrayList;

public abstract class User{
    private String username;
    private String password;
    //private paymentOption paymentOption;
    private String emailAddress;
    private int phoneNr;
    private ArrayList<String> blocked;
    private Gender gender;
    private int age;
    private paymentOption payment;
    private ArrayList<Review> reviews;


    public User(String username, String password, String emailAddress, int phoneNr, String gender2, int age){
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

    public Boolean isBlocked(User user){
        for (String userName : this.blocked){
            if(userName == user.getName()){
                return true;
            }
        }
        return false;

    }

    public Review makeReview(Stars stars, String reviewText, Job job){
        return new Review(stars, reviewText, job);
    }

    public String getName(){
        return this.username;
    }
    


}