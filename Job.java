import java.sql.Time;

public class Job {
    private Responder responder;
    private int elapsedTime;
    private Request request;
    private jobStatus status;
    private int arrivalTime;
    private Payment payment;

    public Job(Request request, Responder responder){
        this.request = request;
        this.responder = responder;
        this.status = jobStatus.active;
    }

    public void indicateArrival(int arrivalTime){
        this.arrivalTime = arrivalTime;
    }

    public void changeStatus(jobStatus newStatus){
        this.status = newStatus;
    }
    
    public void addPayment(Payment newPayment){
        this.payment=newPayment;
    }
    public Request getRequestFromJob(){
        return this.request;
    }
}
