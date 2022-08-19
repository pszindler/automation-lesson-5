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

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
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
