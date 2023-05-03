import java.util.Iterator;
import java.util.TreeMap;
import java.util.Scanner;
public class SaveScores {
        public static void askFerScore (int playerCount, int scoreboard[][]) {
                Scanner input = new Scanner(System.in);
                System.out.println("What section is your score in? Type in the number. \n1. Ones\n" +
                        "2. Twos\n" +
                        "3. Threes\n" +
                        "4. Fours\n" +
                        "5. Fives\n" +
                        "6. Sixes\n" +
                        "7. 3 of a Kind\n" +
                        "8. 4 of a Kind\n" +
                        "9. Small Straight\n" +
                        "10. Large Straight\n" +
                        "11. Chance\n" +
                        "12. Yahtzee");
                int type = input.nextInt();
                type--;
                System.out.println("What did you score?");
                int score = input.nextInt();
                scoreboard[playerCount][type] = score; //First is player #, 2nd is type, set it to the score.
        }
}

//this too