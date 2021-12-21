import java.util.Comparator;

import java.util.Comparator;
public class ResponderAssignSorter implements Comparator<responderAssign> {
    @Override
    public int compare(responderAssign o1, responderAssign o2) {
        return Math.round(o1.getSuitabilityForRequest() - o2.getSuitabilityForRequest());
    }
    
}
