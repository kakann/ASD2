public class Message {
    private String message;
    private User sender;
    private int timestamp;

    public Message(String message, User sender, int timestamp){
        this.message=message;
        this.sender=sender;
        this.timestamp= timestamp;
    }
}
