import javax.swing.JOptionPane;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;

        int attempts = 0;
        int maxAttempts = 10;

        JOptionPane.showMessageDialog(null,
                "NUMBER GUESSING GAME\n\n" +
                "Guess a number between 1 and 100\n" +
                "You have " + maxAttempts + " attempts.");

        while (attempts < maxAttempts) {

            String input = JOptionPane.showInputDialog(null,
                    "Attempt " + (attempts + 1) + "\nEnter your guess:");

            if (input == null) {
                JOptionPane.showMessageDialog(null, "Game Cancelled");
                return;
            }

            int guess = Integer.parseInt(input);
            attempts++;

            if (guess < numberToGuess) {
                JOptionPane.showMessageDialog(null, "Too Low!");
            } else if (guess > numberToGuess) {
                JOptionPane.showMessageDialog(null, "Too High!");
            } else {
                JOptionPane.showMessageDialog(null,
                        "🎉 Correct Guess!\nAttempts: " + attempts);
                return;
            }
        }

        JOptionPane.showMessageDialog(null,
                "❌ Game Over!\nCorrect number was: " + numberToGuess);
    }
}
