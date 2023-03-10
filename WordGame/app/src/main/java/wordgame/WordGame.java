/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package wordgame;

public class WordGame {
    public String gameWord;
    public Integer remaining = 10;

    public WordGame (String wordToGuess) {
    gameWord = wordToGuess;
}

    public String getWordToGuess() {
        StringBuilder toGuess = new StringBuilder(gameWord);
        for (int i = 1; i < gameWord.length(); i++) {
            toGuess.setCharAt(i, '_');
        }
        return toGuess.toString();
    }

    public Integer getRemainingAttempts() {
        return this.remaining;
    }

    public static void main(String[] args) {
    }
}
