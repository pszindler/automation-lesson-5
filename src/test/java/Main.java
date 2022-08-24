import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MovieLibrary movieLibrary = DataToObj.mapJsonToObj("src/jsonData/movies.json");
        chooseMenuOption(movieLibrary);
    }

    public static void chooseMenuOption(MovieLibrary movieLibrary) {
        while (true) {
            Menu.printMenu();
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextLine()) {
                case "1" -> {
                    System.out.println("Data od:");
                    int fd = scanner.nextInt();
                    System.out.println("Data do:");
                    int td = scanner.nextInt();
                    movieLibrary.getMoviesFromXToY(fd, td);
                }
                case "2" -> movieLibrary.getRandomMovieInfo();
                case "3" -> {
                    System.out.println("Imie aktora: ");
                    String name = scanner.nextLine();
                    System.out.println("Nazwisko aktora: ");
                    String lastName = scanner.nextLine();
                    movieLibrary.getMoviesByActor(name, lastName);
                }
                case "4" -> System.exit(0);
            }
        }

    }
}
