import java.util.Random;
import java.util.Scanner;
public class PrintScoreboard {
    public static void printio(int playerCount, int[][]scoreboard)
    {
        for (int i = 0; i < playerCount; i++) {
            int bonus = 0;
            int section1total = scoreboard[i][1] + scoreboard[i][2] + scoreboard[i][3] + scoreboard[i][4] + scoreboard[i][5] + scoreboard[i][0];
            scoreboard[i][12] = section1total;
            if (section1total > 62) {
                bonus = 35;
            }
            scoreboard[i][13] = bonus;
            int section2total = scoreboard[i][6] + scoreboard[i][7] + scoreboard[i][8] + scoreboard[i][9] + scoreboard[i][10] + scoreboard[i][11];
            scoreboard[i][14] = section2total;
            scoreboard[i][15] = section1total+section2total+bonus;
        }
        Scanner input = new Scanner(System.in);
        String[] names = {"Ones: ", "Twos: ","Threes: ","Fours: ","Fives: ","Sixes: ", "3 of a Kind: ", "4 of a Kind: ", "Small Straight: ", "Large Straight: ", "Chance: ", "Yahtzee: ", "Section 1 Totals: ", "Bonus:  ", "Section 2 Total: ", "Grand Total: "};
//call player class]
        for(int i = 0; i < 16; i++) {
            System.out.println(names[i]);
            for(int z = 0; z < playerCount; z++) {
                System.out.println(" Player " + (z+1) + ": " + scoreboard[z][i]);
            }
        }
        System.out.println();
    }
}
//Changesmore