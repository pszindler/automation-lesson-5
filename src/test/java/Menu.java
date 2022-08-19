import java.util.Scanner;

public class Menu {

    public static void printMenu() {
        while (true) {
            System.out.println("""
                    1. Podaj dwie daty aby wyświetlić nazwy filmów wydanych pomiędzy tymi datami
                    2. Wyświetl wszystkie informacje o losowym filmie
                    3. Podaj imię i nazwisko aktora aby wyświetlić nazwy filmów w jakich zagrał
                    4. Exit""");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextLine()) {
                case "1" -> {
                    System.out.println("Data od:");
                    int fd = scanner.nextInt();
                    System.out.println("Data do:");
                    int td = scanner.nextInt();
                    MovieLibrary.getMoviesFromXToY(fd, td);
                }
                case "2" -> MovieLibrary.getRandomMovieInfo();
                case "3" -> {
                    System.out.println("Imie aktora: ");
                    String name = scanner.nextLine();
                    System.out.println("Nazwisko aktora: ");
                    String lastName = scanner.nextLine();
                    MovieLibrary.getMoviesByActor(name, lastName);
                }
                case "4" -> System.exit(0);
            }
        }


    }
}
