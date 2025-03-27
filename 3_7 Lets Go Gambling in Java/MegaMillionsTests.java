import static org.junit.Assert.*;
import org.junit.Test;

// No import for MegaMillions needed if both are in the same source folder

public class MegaMillionsTests {



// add remaining tests for full coverage    
@Test
public void testGetPrizeAllScenarios() {
    MegaMillions game = new MegaMillions();
    
    // Format: assertEquals(message, expected, actual, delta)
    assertEquals("Jackpot prize incorrect", 100000000, game.getPrize(5, true), 0);
    assertEquals("5 matches without Mega Ball", 1000000, game.getPrize(5, false), 0);

    assertEquals("4 matches with Mega Ball", 10000, game.getPrize(4, true), 0);
    assertEquals("4 matches without Mega Ball", 500, game.getPrize(4, false), 0);

    assertEquals("3 matches with Mega Ball", 200, game.getPrize(3, true), 0);
    assertEquals("3 matches without Mega Ball", 10, game.getPrize(3, false), 0); //new case

    assertEquals("2 matches with Mega Ball", 10, game.getPrize(2, true), 0); //new case
    assertEquals("2 matches without Mega Ball", 0, game.getPrize(2, false), 0); //new case

    assertEquals("1 match with Mega Ball", 4, game.getPrize(1, true), 0); //new case
    assertEquals("1 match without Mega Ball", 0, game.getPrize(1, false), 0); //new case

    assertEquals("No matches with Mega Ball", 2, game.getPrize(0, true), 0); //new case
    assertEquals("No matches, no prize", 0, game.getPrize(0, false), 0);
}

}