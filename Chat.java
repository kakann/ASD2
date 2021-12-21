import java.util.ArrayList;

public class Chat {
    private ArrayList<User> users;
    private ArrayList<Message> messages; 
    
    public Chat(ArrayList<User> users){
        this.users = users;
    }

    public void createMessage(Message msg){
        this.messages.add(msg);

        ArrayList<User> clone = (ArrayList<User>) this.users.clone();
        while(clone.size() != 0){
            transmit(this.users.remove(0), msg);
        }
    }

    public void transmit(User user, Message msg){
        //function to send msg to a specific user.

    }
    
}
