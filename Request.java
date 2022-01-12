import java.util.ArrayList;

public class Request {
    private Senior senior;
    private int requestTime;
    private boolean emergency;
    private int estimatedTime;
    private int deadline;
    private String description;
    private ArrayList<Tool> tools;
    private ArrayList<Skill> skills;

    public Request(Senior senior, int requestTime, boolean emergency, int estimateTime, int deadline, String description){
        this.senior=senior;
        this.requestTime = requestTime;
        this.emergency = emergency;
        this.estimatedTime = estimateTime;
        this.deadline = deadline;
        this.description = description;

    }

    public Senior getSenior() {
        return this.senior;
    }
    
    
}
