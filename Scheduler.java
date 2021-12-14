
import java.util.ArrayList;
public class Scheduler {
    private ArrayList<Responder> responders;
    private Request request;
    private ArrayList<responderAssign> responderAssigns;
    private Job job;

    public Scheduler(ArrayList<Responder> responders, Request request){
        this.responders=responders;
        this.request=request;
    }

    public responderAssign createResponderAssign(Request request, Responder responder){
        return new responderAssign(responder, request);
    }
    
    public Job createJob(responderAssign responderAssign){
        return new Job(request)

    }
}
