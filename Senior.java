import java.util.ArrayList;

public class Senior extends User {
    private Request currentRequest;
    private ArrayList<Request> requestHistory;
    
    public Senior(String username, String password, Enum paymentOption, String emailAddress, int phoneNr, Gender gender, int age, Address address) {
        super(username, password, paymentOption, emailAddress, phoneNr, gender, age, address);
    }

    public Request makeRequest(int requestTime, boolean emergency, int estimateTime, int deadline, String description){
        Request request = new Request(this, requestTime, emergency, estimateTime, deadline, description);
        Scheduler scheduler = new Scheduler(request);

        return request;    
    }

    public void cancelRequest(Request request, Scheduler scheduler){}

    public ArrayList<Request> getRequestHistory(){
        return this.requestHistory;
    }

    public void makePayment(Job job){}
}
