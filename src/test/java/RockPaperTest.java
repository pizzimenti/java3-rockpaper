import static org.junit.Assert.*;
import org.junit.*;

public class RockPaperTest {

  // @Test
  // public void randomMove_assignMoveToRandomNumber_rock() {
  //   RockPaper testApp = new RockPaper();
  //   assertEquals("rock", testApp.randomMove());
  //   //this 'might' pass about a third of the time
  // }

  @Test
  public void checkPlayer1Wins_rockBeatsScissors_true() {
    RockPaper testApp = new RockPaper();
    assertEquals(true, testApp.checkPlayer1Wins("rock","scissors"));
  }

  @Test
  public void checkTie_rockTiesRock_true() {
    RockPaper testApp = new RockPaper();
    assertEquals(true, testApp.checkTie("rock", "rock"));
  }

  @Test
  public void gameOutcome_paperTiesPaper_tie() {
    RockPaper testApp = new RockPaper();
    assertEquals("tie", testApp.gameOutcome("paper","paper"));
  }
  @Test
  public void gameOutcome_rockLosesPaper_player2wins() {
    RockPaper testApp = new RockPaper();
    assertEquals("player2wins", testApp.gameOutcome("rock","paper"));
  }
}
