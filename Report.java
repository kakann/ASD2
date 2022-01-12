
public class Report {
    private User reporter;
    private User reported;
    private String reportText;

    public Report(User reporter, User reported, String reportText){
        this.reporter = reporter;
        this.reported = reported;
        this.reportText = reportText;
    }

    public void notifyAdmin(){
		// Send report to admin
    }
    
}
