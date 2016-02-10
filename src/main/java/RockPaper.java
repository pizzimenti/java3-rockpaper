import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

import java.util.Random;

public class RockPaper {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/game.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/outcome", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/outcome.vtl");
      String player1Move = request.queryParams("player1Move");
      String player2Move = randomMove();
      String result = gameOutcome(player1Move, player2Move);

      model.put("result", result);
      model.put("player1Move", player1Move);
      model.put("player2Move", player2Move);

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public static String randomMove() {
    Random myRandom = new Random();
    int computerMove = myRandom.nextInt(3);
    if (computerMove == 0) {
      return "rock";
    } else if (computerMove == 1) {
      return "paper";
    } else if (computerMove == 2) {
      return "scissors";
    } else {
      return "randomMove error";
    }
  }

  public static Boolean checkPlayer1Wins(String player1, String player2) {
    if ((player1.equalsIgnoreCase("Rock") && player2.equalsIgnoreCase("Scissors")) || (player1.equalsIgnoreCase("Paper") && player2.equalsIgnoreCase("Rock")) || (player1.equalsIgnoreCase("Scissors") && player2.equalsIgnoreCase("Paper"))) {
      return true;
    }
    return false;
  }

  public static Boolean checkTie(String player1, String player2) {
    if ((player1.equalsIgnoreCase("Rock") && player2.equalsIgnoreCase("Rock")) || (player1.equalsIgnoreCase("Paper") && player2.equalsIgnoreCase("Paper")) || (player1.equalsIgnoreCase("Scissors") && player2.equalsIgnoreCase("Scissors"))) {
      return true;
    }
    return false;
  }

  public static String gameOutcome(String player1, String player2) {

    if (checkTie(player1, player2)) {
      return "Tie";
    } else if (checkPlayer1Wins(player1, player2)) {
      return "Player 1 Wins";
    } else {
      return "Player 2 Wins";
    }
  }
}
