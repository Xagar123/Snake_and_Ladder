import java.util.Scanner;
public class player1 {
    public static void main(String[] args) {
        System.out.println("Welcome to snake and ladder Game");
        System.out.println("Both the player is at zero position");
        int playerA = 0;
        int playerB = 0;
        int noPlay = 0;
        int ladder = 1;
        int snake = 2;
        int count = 0;
        int compare = 1;
        while (playerA < 100 || playerB <100) {
            int DieRollA = (int) Math.floor(Math.random() * 10) % 7;
            int DieRollB = (int) Math.floor(Math.random() * 10) % 7;
            count++;
            System.out.println("Player A roll die " + "he move " + DieRollA + " Steps");
            compare = (int) Math.floor(Math.random() * 10) % 3;
            switch (compare) {
                case 0:
                    System.out.println("The player in the same position");
                    break;
                case 1:
                    System.out.println("player moves ahead by the " + DieRollA + " number of position");
                    playerA += DieRollA;
                    break;
                case 2:
                    System.out.println("The player move behind by " + DieRollA + " Moves");
                    playerA -= DieRollA;
            }
            System.out.println("Player B roll die " + "he move " + DieRollB + " Steps");
            compare = (int) Math.floor(Math.random() * 10) % 3;
            switch (compare) {
                case 0:
                    System.out.println("The player in the same position");
                    break;
                case 1:
                    System.out.println("player moves ahead by the " + DieRollB + " number of position");
                    playerB += DieRollB;
                    break;
                case 2:
                    System.out.println("The player move behind by " + DieRollB + " Moves");
                    playerB -= DieRollB;
            }

            if (playerA > 100) {
                playerA = 100;
            } else if (playerB > 100) {
                playerB = 100;
            } else {
                System.out.println("Position of player A is " + playerA);
                System.out.println("Position of player B is " + playerB);
            }
        }
        if(playerA > playerB){
            System.out.println("Player A win the game");
        }
        else {
            System.out.println("Player B won the game");
        }
        //System.out.println("Player A final position " + playerA);
        System.out.println("times the dice was played to win the game is " + count);
    }
}
