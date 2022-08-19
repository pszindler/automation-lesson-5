import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MovieLibrary {
    private static ArrayList<Movie> movies;

    public MovieLibrary() {
        List<Movie> movies = new ArrayList<>();
    }

    public static ArrayList<Movie> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public MovieLibrary(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "" + movies;
    }

    private static void printMovieTitle (List<Movie> movies) {
        for (Movie movie: movies) {
            System.out.println(movie.getTitle());
        }
    }

    public static void getMoviesFromXToY (int fromDate, int toDate) {
        ArrayList<Movie> filteredMovies = MovieLibrary.getMovies();
        filteredMovies = ((ArrayList<Movie>) filteredMovies.stream()
                .filter(movie -> movie.getDate() >= fromDate
                        && movie.getDate() <= toDate)
                .collect(Collectors.toList()));
        if (!filteredMovies.isEmpty()) {
            printMovieTitle(filteredMovies);
        } else {
            System.out.println("No Data.");
        }
    }

    public static void getRandomMovieInfo () {
        Random random = new Random();
        ArrayList<Movie> filteredMovies = MovieLibrary.getMovies();
        int moviesLength = filteredMovies.size();
        int randomMovie = random.nextInt(moviesLength);
        System.out.println(filteredMovies.get(randomMovie));
    }

    public static void getMoviesByActor (String firstName, String lastName) {
        ArrayList<Movie> filteredMovies = MovieLibrary.getMovies();
        Predicate<Movie> filterByNameAndLastName =
                d -> d.getActors().stream()
                        .anyMatch(a -> a.firstName().equals(firstName)
                                && a.lastName().equals(lastName));

        filteredMovies = (ArrayList<Movie>) filteredMovies.stream()
                .filter(filterByNameAndLastName).collect(Collectors.toList());
        if (!filteredMovies.isEmpty()) {
            printMovieTitle(filteredMovies);
        } else {
            System.out.println("No Data.");
        }
    }
}

