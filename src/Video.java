public abstract class Video {
    private String tittle;
    private String author;
    private int views;
    private double valuationScore;

    public Video(String tittle,String author, int views, double valuationScore) {
        this.tittle=tittle;
        this.author = author;
        this.views = views;
        this.valuationScore = valuationScore;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public double getValuationScore() {
        return valuationScore;
    }

    public void setValuationScore(double valuationScore) {
        this.valuationScore = valuationScore;
    }
}
