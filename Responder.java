import java.util.ArrayList;
public class Responder extends User {
    private Job acceptedJob;
    private Request proposedRequest;

    public Responder(String username, String password, String emailAddress, int phoneNr, String gender, int age) {
        super(username, password, emailAddress, phoneNr, gender, age);
        //TODO Auto-generated constructor stub
    }

    public void acceptJob(Request request){

    }

    public ArrayList<Payment> getPaymentsDue(){
        return new ArrayList<Payment>();
    }

    public ArrayList<Request> getRequestHistory(){
        return new ArrayList<Request>();
    }

    public ArrayList<Request> getPendingRequests(){
        return new ArrayList<Request>();

    




    
}
