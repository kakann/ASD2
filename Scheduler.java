
import java.util.ArrayList;
import java.util.Collection;
import java.util.*;
public class Scheduler {
    //private ArrayList<Responder> responders;
    private Request request;
    private ArrayList<responderAssign> responderAssigns;
    private Job job;

    public Scheduler( Request request){
        this.request=request;
    }

    public responderAssign createResponderAssign(Request request, Responder responder){
        return new responderAssign(responder, request);
    }
    
    public Job createJob(responderAssign responderAssign ){
        return new Job(this.request, responderAssign.getResponder());
    }

    public ArrayList<Responder> mostSuitableResponders(Request request){
        ArrayList<responderAssign> responderAssigns = new ArrayList<responderAssign>();
        for(Responder responder: responders.responders){
            responderAssigns.add(createResponderAssign(request, responder)); 
        }

        responderAssigns.sort(new ResponderAssignSorter());
        ArrayList<Responder> responders = new ArrayList<Responder>();
        for(responderAssign r : responderAssigns){
            responders.add(r.getResponder());
        }
        Collections.reverse(responders);
        return responders;
    }

    public Boolean sendRequest(Responder responder, Request request){
        responder.changeProposedRequest(request);
        Boolean success = false;
        return success; 
    }

    public void pushJobToSenior(Job job){
        Senior senior = job.getRequestFromJob().getSenior();
        //Then notify the senior that the job has been assigned
    }
}
