import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

import java.util.Random;

public class RockPaper {
  public static void main(String[] args) {}

  

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

  public static String runGame(String player1, String player2) {
    if (checkTie(player1, player2)) {
      return "tie";
    } else if (checkPlayer1Wins(player1, player2)) {
      return "player1wins";
    } else {
    return "player2wins";
    }
  }
  // runGame{
  //   if(checktie()){
  //     return "tie";
  //   }
  //   if (checkPlayer1Wins()) {
  //     return "player1wins"
  //   } else {
  //     return "player2wins"
  //   }
  //
  // }


}
