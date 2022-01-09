
import java.util.ArrayList;
import java.util.Collection;
import java.util.*;
public class Scheduler {
    //private ArrayList<Responder> responders;
    private Request request;
    private ArrayList<ResponderAssign> responderAssigns;
    private Job job;

    public Scheduler(Request request){
        this.request=request;
        ArrayList<Responder> responders = mostSuitableResponders(request);

        for(Responder responder : responders){
            sendRequest(responder, request);
            //wait until response within certain timelimit
            }
    }
    
    public ResponderAssign createResponderAssign(Request request, Responder responder){
        return new ResponderAssign(responder, request);
    }
    
    public Job createJob(ResponderAssign responderAssign){
        return new Job(this.request, responderAssign.getResponder());
    }    

    public ArrayList<Responder> mostSuitableResponders(Request request){
        ArrayList<ResponderAssign> responderAssigns = new ArrayList<ResponderAssign>();
        for(Responder responder: responders.responders){
            responderAssigns.add(createResponderAssign(request, responder)); 
        }

        responderAssigns.sort(new ResponderAssignSorter());
        ArrayList<Responder> responders = new ArrayList<Responder>();
        for(ResponderAssign r : responderAssigns){
            responders.add(r.getResponder());
        }
        Collections.reverse(responders);
        return responders;
    }

    public Boolean sendRequest(Responder responder, Request request){
        //Send request to responder
        Boolean success = false;
        return success; 
    }

    public void pushJobToSenior(Job job){
        Senior senior = job.getRequestFromJob().getSenior();
        //Then notify the senior that the job has been assigned
    }
}
