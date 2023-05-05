import java.util.Iterator;
import java.util.TreeMap;
import java.util.Scanner;
public class SaveScores {
        public static void askFerScore (int playerCount, int scoreboard[][], int dice[]) {
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
                int score = 0;
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
                for (int i = 0; i < 4; i++) {
                        System.out.print(dice[i]);
                }
                if (type == 0){ //Ones
                     score = ones;
                }
                if (type == 1){ //Twos
                        score = twos*2;
                }
                if (type == 2){ //Threes
                        score = threes*3;
                }
                if (type == 3){ //Fours
                        score = fours*5;
                }
                if (type == 4){ //Fives
                        score = fives*5;
                }
                if (type == 5){ //Sixes
                        score = sixes*6;
                }
                if (type == 6){ //3 of a Kind
                        if (ones > 3 || twos > 3 || threes > 3 || fours > 3 || fives > 3 || sixes > 3){
                                score = ones+twos+threes+fours+fives+sixes;
                        } else {
                                score = 0;
                        }
                }
                if (type == 7){ //4 of a Kind
                        if (ones > 4 || twos > 4 || threes > 4 || fours > 4 || fives > 4 || sixes > 4){
                                score = ones+twos+threes+fours+fives+sixes;
                        } else {
                                score = 0;
                        }
                }
                if (type == 8){ //Small Straight
                        if (ones  > 0 && twos > 0 && threes > 0 && fours > 0 || twos > 0 && threes > 0 && fours > 0 && fives > 0 || threes > 0 && fours > 0 && fives > 0 && sixes > 0){
                                score = 40;
                        } else {
                                score = 0;
                        }
                }
                if (type == 9){ //Large Straight
                        if (ones  > 0 && twos > 0 && threes > 0 && fours > 0 && fives > 0 || twos > 0 && threes > 0 && fours > 0 && fives > 0 && sixes > 0){
                                score = 40;
                        } else {
                                score = 0;
                        }
                }
                if (type == 10) { //Chance
                        score = ones+twos+threes+fours+fives+sixes;
                }
                if (type == 11){ //Yahtzee
                        if (ones == 5 || twos == 5 || threes == 5 || fours == 5 || fives == 5 || sixes == 5){
                                score = 50;
                        } else {
                                score = 0;
                        }
                }
                //System.out.println("What did you score?");
                //int score = input.nextInt();
                scoreboard[playerCount][type] = score; //First is player #, 2nd is type, set it to the score.
        }
}

//this tooh