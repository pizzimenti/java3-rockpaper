import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class RockPaper {
  public static void main(String[] args) {

  }

  public static Boolean checkPlayer1Wins(String player1, String player2) {
    if (player1 == "Rock" && player2 == "Scissors") {
      return true;
    }
    return false;
  }
}
