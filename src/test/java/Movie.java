import java.util.ArrayList;

public class Movie {
    private String title;
    private String genre;
    private int date;
    private Director director;
    private ArrayList<Actor> actors;

    public Movie(String title, String genre, int date, Director director, ArrayList<Actor> actors) {
        this.title = title;
        this.genre = genre;
        this.date = date;
        this.director = director;
        this.actors = actors;
    }

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getDate() {
        return date;
    }

    public Director getDirector() {
        return director;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    @Override
    public String toString() {
        return "title: " + title + "\n" +
                "director: " + director + "\n" +
                "genre: " + genre + "\n" +
                "date: " + date + "\n" +
                "actors: " + actors.toString().replace("[", "").replace("]", "");
    }

}
