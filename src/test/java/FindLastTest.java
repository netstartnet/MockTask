import org.example.Posters;
import org.example.PostersManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FindLastTest {

    PostersManager pManager = new PostersManager(8);

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
    public void findLastMoreTest() {
        Posters[] expected = {movie5, movie4, movie3, movie2, movie1};
        Posters[] actual = pManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}
