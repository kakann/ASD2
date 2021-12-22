
import java.util.ArrayList;
import java.util.Random;
import java.util.random.*;
import java.util.concurrent.ThreadLocalRandom;

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
    private ArrayList<Review> writtenReviews;
    private ArrayList<Review> Reviews;


    public User(String username, String password, String emailAddress, int phoneNr, Gender gender, int age){
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

    public Chat createChat(ArrayList<User> users){
        return new Chat(users);
    }

    public void sendMessage(Chat chat, String msg){
        //Cheat for describing an interger representing a timestamp.
        int time = ThreadLocalRandom.current().nextInt(0, 5 + 1);
        chat.addMessage(msg, this, time);

    }

    public String resetPassword(String emailAddress){
        String newPassword = "0000";
		return newPassword;
    }
    
    


}