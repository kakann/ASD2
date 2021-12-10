import java.sql.Time;

public class Job {
    private int elapsedTime;
    private Request request;
    private jobStatus status;
    private int arrivalTime;
    private Payment payment;

    public Job(int elapsedTime, Request request, int arrivalTime){
        this.elapsedTime = elapsedTime;
        this.request = request;
        this.status = jobStatus.active;
    }

    public void indicateArrival(int arrivalTime){
        this.arrivalTime = arrivalTime;
    }

    public void changeStatus(jobStatus newStatus){
        this.status = newStatus;
    }
    
}
