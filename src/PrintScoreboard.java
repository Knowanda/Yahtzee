import java.util.Random;
import java.util.Scanner;
public class PrintScoreboard {
    public static void printio(int playerCount)
    {
        Scanner input = new Scanner(System.in);
        //call player class
        System.out.println("Ones:");
        for(int i = 0; i < playerCount; i++){
            System.out.println("Player " + (i+1) + ": "); //put in reference to wherever in the scores array it is (controlled by i)
        }
    }
}
