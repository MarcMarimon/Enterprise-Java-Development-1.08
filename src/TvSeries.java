public class TvSeries extends Video{
    private int seasons;
    private int episodes;

    public TvSeries(String tittle, String author, int views, double valuationScore, int seasons, int episodes) {
        super(tittle, author, views, valuationScore);
        this.seasons = seasons;
        this.episodes = episodes;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}
