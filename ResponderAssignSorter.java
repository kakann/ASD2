import java.util.Comparator;

import java.util.Comparator;
public class ResponderAssignSorter implements Comparator<ResponderAssign> {
    @Override
    public int compare(ResponderAssign o1, ResponderAssign o2) {
        return Math.round(o1.getSuitabilityForRequest() - o2.getSuitabilityForRequest());
    }
    
}
