public class Review {
    private Stars rating;
    private String reviewText;
    private Job job;

    public Review(Stars stars, String reviewText, Job job){
        this.rating = rating;
        this.reviewText = reviewText;
        this.job=job;
    }
}
