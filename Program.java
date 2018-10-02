// Guess the word!
import java.util.Scanner;
import java.util.Random;

public class Program
{
    public static class Hacking
    {
        // Initialisation array of words -----------------------------------------------------------------------------
        String[] words = { "have", "with", "that", "look", "what", "from", "know", "back", "like", "come" };
        
        public void mysteryWord()
        {
            // Output array of words -------
            System.out.println("------------------------");
            for (int x = 0; x < 10; x++)
                System.out.println("          " + words[x]);
            System.out.println("------------------------");
        }
        public void gameToStart()
        {
            System.out.println();
            System.out.println("Guess the word!");
            System.out.println();

            // Definition random word from array ------------------------
            Random rnd = new Random(System.currentTimeMillis());
            int num = rnd.nextInt(10);
            String word = words[num];
            // ------------------------------------------------------------------

            //System.out.println(word);

            // Getting user input ------------------------
            Scanner temp = new Scanner(System.in);
            String usrWord = temp.nextLine();
            // ----------------------------------------------
            
            // Condition that testing equality words --------
            if (word.equals(usrWord) == true)
                System.out.println("You win!");
            else
                System.out.println("You lose!");
            // ------------------------------------------------
        }
    }
    public static void main(String[] args)
    {
        Hacking hack = new Hacking();
        hack.mysteryWord();
        hack.gameToStart();
    }
}
