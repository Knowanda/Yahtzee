import java.util.Random;
import java.util.Scanner;
public class PrintScoreboard {
    public static void printio(int playerCount, int[][]scoreboard)
    {
        Scanner input = new Scanner(System.in);
        String[] names = {"Ones: ", "Twos: ","Threes: ","Fours: ","Fives: ","Sixes: ", "3 of a Kind: ", "4 of a Kind: ", "Small Straight: ", "Large Straight: ", "Chance: ", "Yahtzee: "};
        //call player class]
        for(int i = 0; i < 12; i++) {
            System.out.println(names[i]);
            for(int z = 0; z <  playerCount; z++) {
                System.out.println("   Player " + (z+1) + ": " + scoreboard[z][i]);
            }
        }
        System.out.println();
    }
}
