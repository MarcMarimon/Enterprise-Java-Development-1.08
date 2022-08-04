public class Movie extends Video{
    private double duration;

    public Movie(String tittle, String author, int views, double valuationScore, double duration) {
        super(tittle, author, views, valuationScore);
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}
