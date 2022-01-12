import java.util.ArrayList;
public class Responder extends User {
    private Job acceptedJob;


    public Responder(String username, String password, Enum paymentOption, String emailAddress, int phoneNr, Gender gender, int age, Address address) {
        super(username, password, paymentOption, emailAddress, phoneNr, gender, age, address);
        responders.responders.add(this);
    }

    public void acceptJob(Request request){
        // Function for accepting a Job.
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

    public float calculateAverageRating(ArrayList<Review> reviews){
        float total = 0;
        for(Review review: reviews){
            total += review.getRating();
        }
        int size = reviews.size();
        return  total/size;
    }

    public int indicateJobArrival(){
        return 2022011516;
    }

    

    

    




    
}
