import java.util.ArrayList;

public class Request {
    private Senior senior;
    private int requestTime;
    private boolean emergency;
    private float estimatedTime;
    private float deadline;
    private String description;
    private ArrayList<Tool> tools;
    private ArrayList<Skill> skills;

    public Request(Senior senior, int requestTime, boolean emergency, float estimateTime, float deadline, String description){
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
