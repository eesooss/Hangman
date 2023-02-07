public class Hangman {
    private boolean running = false;
    private RandomWord word = new RandomWord();

    public void run() {
        do {
            displayWord();
            getUserInput();
            checkUserInput();
        } while (running);
    }

    void displayWord() {
        System.out.println(word);
    }

    private void getUserInput() {

    }

    private void checkUserInput() {

    }
}
