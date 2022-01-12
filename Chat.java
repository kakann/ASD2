import java.util.ArrayList;
import java.util.Random;
import java.util.random.*;
import java.util.concurrent.ThreadLocalRandom;
public class Chat {
    private ArrayList<User> users;
    private ArrayList<Message> messages; 
    
    public Chat(ArrayList<User> users){
        this.users = users;
    }

    public void addMessage(String message, User sender){
        int timeStamp = ThreadLocalRandom.current().nextInt(0, 5 + 1);
        Message msg = new Message(message, sender, timeStamp);
        this.messages.add(msg);

        for(User u : this.users){
            transmit(u, msg);
        }
    }

    public void transmit(User user, Message msg){
        //function to send msg to a specific user.
    }

}
