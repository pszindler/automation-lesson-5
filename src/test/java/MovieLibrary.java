import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MovieLibrary {
    private ArrayList<Movie> movies;

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "" + movies;
    }

    private static void printMovieTitle(List<Movie> movies) {
        for (Movie movie : movies) {
            System.out.println(movie.getTitle());
        }
    }

    public void getMoviesFromXToY(int fromDate, int toDate) {
        ArrayList<Movie> filteredMovies = getMovies();
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

    public void getRandomMovieInfo() {
        Random random = new Random();
        ArrayList<Movie> filteredMovies = getMovies();
        int moviesLength = filteredMovies.size();
        int randomMovie = random.nextInt(moviesLength);
        System.out.println(filteredMovies.get(randomMovie));
    }

    public void getMoviesByActor(String firstName, String lastName) {
        ArrayList<Movie> filteredMovies = getMovies();
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

