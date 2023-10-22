import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void addedFilmsZero() {

        FilmManager manager = new FilmManager();

        String[] actual = manager.findAll();

        String[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addedOneFilms() {
        FilmManager manager = new FilmManager();
        manager.addFilm("Film 1");

        String[] actual = manager.findAll();
        String[] expected = {"Film 1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addedThreeFilms() {

        FilmManager manager = new FilmManager();
        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");

        String[] actual = manager.findAll();
        String[] expected = {"Film 1", "Film 2", "Film 3"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFiveFromEmptyManager() {

        FilmManager manager = new FilmManager(5);
        manager.findLast();

        String[] actual = manager.findLast();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFiveFromManagerThree() {

        FilmManager manager = new FilmManager(5);
        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.findLast();

        String[] actual = manager.findLast();
        String[] expected = {"Film 3", "Film 2", "Film 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFiveFromManagerFive() {

        FilmManager manager = new FilmManager(5);
        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");
        manager.findLast();

        String[] actual = manager.findLast();
        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFiveFromManagerTen() {
        FilmManager manager = new FilmManager(5);
        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");
        manager.addFilm("Film 6");
        manager.addFilm("Film 7");
        manager.addFilm("Film 8");
        manager.addFilm("Film 9");
        manager.addFilm("Film 10");

        String[] actual = manager.findLast();
        String[] expected = {"Film 10", "Film 9", "Film 8", "Film 7", "Film 6"};
        Assertions.assertArrayEquals(expected, actual);
    }
}