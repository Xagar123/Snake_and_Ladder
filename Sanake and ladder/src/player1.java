import java.util.Scanner;
public class player1 {
    public static void main(String[] args) {
        System.out.println("Welcome to snake and ladder Game");
        System.out.println("Both the player is at zero position");
        int playerA = 0;
        int noPlay = 0;
        int ladder = 1;
        int snake = 2;
        int count = 0;
        int compare = 1;
        // (UC4)Repeat till the Player reaches the winning position 100.
        while (playerA < 100) {
            int DieRoll = (int) Math.floor(Math.random() * 10) % 7;
            // (UC6) number of times the dice was played
            count++;
            System.out.println("Player A roll die " + "he move " + DieRoll + " Steps");
            compare = (int) Math.floor(Math.random() * 10) % 3;
            // (UC3)The Player then checks for a Option. They are No Play,Ladder or Snake.
            switch (compare) {
                case 0:
                    System.out.println("The player in the same position");
                    break;
                case 1:
                    System.out.println("player moves ahead by the " + DieRoll + " number of position");
                    playerA += DieRoll;
                    break;
                case 2:
                    System.out.println("The player move behind by " + DieRoll + " Moves");
                    playerA -= DieRoll;
            }
            //(UC5) Ensure the player gets to exact winning position 100.
            if (playerA < 100) {
                System.out.println("Player A position " + playerA);
            } else {
                playerA = 100;
                System.out.println("Player A position is 100");
            }
            System.out.println("Player A final position " + playerA);
            System.out.println("times the dice was played to win the game is " + count);
        }
    }
}
