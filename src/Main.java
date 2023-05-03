import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void gamePlay() {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int die = 5;
        int end;
        int changeNum;
        int dieRandomSelect;
        String[] dice = {"[1]", "[2]", "[3]", "[4]", "[5]", "[6]"};
        int[] playersDiceList = {0, 0, 0, 0, 0};
        int diceRollCount = 0;
        for (int z = 0; z < die; z++) // initializes and prints dice
        {
            dieRandomSelect = rand.nextInt(0, 6); // creates and prints first 5 random dice
            System.out.print(dice[dieRandomSelect]);
            playersDiceList[z] = dieRandomSelect; // used for storing the players dice in between rolls
// it's where the pointer is at in the list, not the num
// so [1] = 0
// Make this more intuitive for the user - Joseph
        }
        do // This is used to ask player if they want to change dice and re prints them.
        {
            end = 0;
            System.out.print("\nWould you like to change any dice?\nIf so please type any character.\n" +
                    "If you don't want to change any dice type '3'.");
            end = input.nextInt();

            if (end != 3) // checks if player wants to change dice.
            {
                System.out.print("How many dice would you like to change?");
                changeNum = input.nextInt();
                int tempInt;
                for (int z = 0; z < changeNum; z++) // loop that asks for die needing to be changed and switches it.
                {
                    System.out.print("What is dice number " + (z + 1) + " needing to be changed?");
                    tempInt = input.nextInt();
                    tempInt--;
                    playersDiceList[tempInt] = rand.nextInt(0, 6);
                }
                for (int z = 0; z < die; z++) // prints new dice... probably should have put this in a function.
                {
                    System.out.print(dice[playersDiceList[z]]);
                }
                diceRollCount ++;
            }
        } while (end != 3 && diceRollCount != 3);

        System.out.print("\n");
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        SaveScores myObj = new SaveScores();
        PrintScoreboard myObj2 = new PrintScoreboard();

        int[][] scoreboard = {{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}}; //Allows for 5 players
        int playerCount;
        System.out.print("Welcome to Yahtzee!\n");
        System.out.print("How many players would like to play?\n");
        playerCount = input.nextInt();
        if(playerCount > 5){
            System.out.println("You can't do that! Go edit the code! You suck!");
            for (int hahayousuck = 0; hahayousuck < 100; hahayousuck++) {
                System.out.println("Haha you suck.");
                hahayousuck--;
            }
        }
        for(int x = 0; x < 12; x++) {
            for (int i = 0; i < playerCount; i++) {
                System.out.println("Player " + (i + 1) + "'s turn.");
                Main.gamePlay();
                myObj.askFerScore(i, scoreboard);
            }
            myObj2.printio(playerCount, scoreboard);
        }
        System.out.println("The game is over! Whoever cheated the most wins!");
    }

}