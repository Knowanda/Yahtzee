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
                int[] dice = {1, 2, 3, 4, 5}; //here as a placeholder, once you figure out how to import the actual dice, delete this.
                int ones = 0, twos = 0, threes = 0, fours = 0, fives = 0, sixes = 0;
                for (int i = 0; i < 5; i++){
                        if(dice[i] == 1) {
                                ones++;
                        }
                        if(dice[i] == 2) {
                                twos++;
                        }
                        if(dice[i] == 3) {
                                threes++;
                        }
                        if(dice[i] == 4) {
                                fours++;
                        }
                        if(dice[i] == 5) {
                                fives++;
                        }
                        if(dice[i] == 6) {
                                sixes++;
                        }
                }
                System.out.println("Ones: " + ones + " Twos: " + twos + " Threes: " + threes + " Fours: " + fours + " Fives: " + fives + " Sixes: " + sixes); //tests the code to see if it's working.
                for (int i = 0; i > 6; i++) {
                        System.out.println(dice[i]);
                }
                //System.out.println("What did you score?");
                //int score = input.nextInt();
                //scoreboard[playerCount][type] = score; //First is player #, 2nd is type, set it to the score.
        }
}

//this too