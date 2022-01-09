import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ResponderAssign {
    private float suitabilityForRequest;
    private Responder responder;
    private Request request;
    private Senior senior;
    private Preference preference;

    public ResponderAssign(Responder responder, Request request){
        this.responder=responder;
        this.request=request;
        this.senior=request.getSenior();

        //CHEAT, this is meant to symbolize the average rating for a responder + the distance 
        //between a senior and a job. Its also ment to take preferences into account.
        this.suitabilityForRequest= ThreadLocalRandom.current().nextInt(0, 5 + 1);
        
        //if block suitability = 0
        if(senior.isBlocked(responder)){
            this.suitabilityForRequest= 0;
        }
    }

    public float getSuitabilityForRequest(){
        return this.suitabilityForRequest;
    }

    public Responder getResponder(){
        return this.responder;
    }
}
