import java.util.ArrayList;

public class Senior extends User {
    private Request currentRequest;
    private ArrayList<Request> requestHistory;
    

    public Senior(String username, String password, String emailAddress, int phoneNr, Gender gender, int age) {
        super(username, password, emailAddress, phoneNr, gender, age);
        //TODO Auto-generated constructor stub
    }

    

    public Request makeRequest(int requestTime, boolean emergency, float estimateTime, float deadline, String description){
        Request request = new Request(this, requestTime, emergency, estimateTime, deadline, description);
        Scheduler scheduler = new Scheduler(request);

        return request;
        
    }

    public void cancelRequest(Request request, Scheduler scheduler){

    }

    public ArrayList<Request> getRequestHistory(){
        return this.requestHistory;
    }

    public void makePayment(Job job){
        
    }


    
}
