import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    private String name;

    @Test
    public void testWhenFirstPlayerWins() {
        Player Iraq = new Player(122, "Ирак", 345);
        Player Iran = new Player(238, "Иран", 223);
        Game game = new Game();

        game.register(Iraq);
        game.register(Iran);
        int actual = game.round("Ирак", "Иран");
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testWhenSecondPlayerWins() {
        Player Iraq = new Player(238, "Иран", 223);
        Player Iran = new Player(122, "Ирак", 345);
        Game game = new Game();

        game.register(Iraq);
        game.register(Iran);
        int actual;
        actual = game.round("Иран", "Ирак");
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
}