import java.util.ArrayList;
public class Responder extends User {
    private Job acceptedJob;
    private Request proposedRequest;

    public Responder(String username, String password, String emailAddress, int phoneNr, Gender gender, int age) {
        
        super(username, password, emailAddress, phoneNr, gender, age);
        responders.responders.add(this);
        //TODO Auto-generated constructor stub
    }
    public void changeProposedRequest(Request request){
        this.proposedRequest = request;
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

    

    




    
}
