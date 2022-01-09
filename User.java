
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public abstract class User{
    private String username;
    private String password;
    private String emailAddress;
    private int phoneNr;
    private ArrayList<User> blocked;
    private Gender gender;
    private int age;
    private Enum payment;
    private ArrayList<Review> writtenReviews;
    private ArrayList<Review> Reviews;
    private Address address;

    public User(String username, String password, Enum payment, String emailAddress, int phoneNr, Gender gender, int age, Address address){
        this.username = username;
        this.password = password;
        this.emailAddress = emailAddress;
        this.phoneNr = phoneNr;
        this.gender = gender;
        this.age = age;
        this.payment=payment;
        this.address=address;
    }

    public void blockUser(User user){
        this.blocked.add(user);
    }

    public void report(User user, String reportDescription){
        //send to police
        new Report(this, user, reportDescription);
    }

    public Boolean isBlocked(User user){
        for (User buser : this.blocked){
            if(buser.getName() == user.getName()){
                return true;
            }
        }
        return false;
    }

    public Review makeReview(int rating, String reviewText, Job job){
        return new Review(rating, reviewText, job);
    }

    public String getName(){
        return this.username;
    }

    public Chat createChat(ArrayList<User> users){
        return new Chat(users);
    }

    public void sendMessage(Chat chat, String msg){
        //Cheat for describing an interger representing a timestamp.
        chat.addMessage(msg, this);

    }

    public String resetPassword(String emailAddress){
        String newPassword = "0000";
		return newPassword;
    }
}