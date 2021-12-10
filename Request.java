import java.util.ArrayList;

public class Request {
    private int requestTime;
    private boolean emergency;
    private float estimatedTime;
    private float deadline;
    private String description;
    private ArrayList<Tool> tools;
    private ArrayList<Skill> skills;

    public Request(int requestTime, boolean emergency, float estimateTime, float deadline, String description){
        this.requestTime = requestTime;
        this.emergency = emergency;
        this.estimatedTime = estimateTime;
        this.deadline = deadline;
        this.description = description;

    }
    
    
}
