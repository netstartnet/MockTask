import org.example.Posters;
import org.example.PostersManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PostersTest {

    PostersManager pManager = new PostersManager();

    Posters movie1 = new Posters("Джентельмены");
    Posters movie2 = new Posters("Револьвер");
    Posters movie3 = new Posters("Фарго");
    Posters movie4 = new Posters("Звездные войны: рассвет империи");
    Posters movie5 = new Posters("1+1");

    @BeforeEach
    public void setup() {
        pManager.save(movie1);
        pManager.save(movie2);
        pManager.save(movie3);
        pManager.save(movie4);
        pManager.save(movie5);
    }

    @Test
    public void saveTest() {

        Posters[] expected = {movie1, movie2, movie3, movie4, movie5};
        Posters[] actual = pManager.getMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAll() {

        Posters[] expected = {movie1, movie2, movie3, movie4, movie5};
        Posters[] actual = pManager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest() {
        Posters[] expected = {movie5, movie4, movie3, movie2, movie1};
        Posters[] actual = pManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}
