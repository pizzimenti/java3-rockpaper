import static org.junit.Assert.*;
import org.junit.*;

public class RockPaperTest {

  @Test
  public void checkPlayer1Wins_rockBeatsScissors_true() {
    RockPaper testApp = new RockPaper();
    assertEquals(true, testApp.checkPlayer1Wins("Rock","Scissors"));
  }

}
