public class Review {
    private int rating;
    private String reviewText;
    private Job job;

    public Review(int rating, String reviewText, Job job){
        this.rating = rating;
        this.reviewText = reviewText;
        this.job=job;
    }

    public int getRating(){
        return this.rating;
    }
}
