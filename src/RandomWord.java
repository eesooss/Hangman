import java.util.Random;

public class RandomWord {
    private String[] words = {"father", "mother", "brother", "family", "sister", "friend", "likeness", "illness"};

    private Random random = new Random();
    private String chosenWord;

    public RandomWord() {
        chosenWord = words[random.nextInt((words.length))];
    }

    public String toString() {
        return chosenWord;
    }
}
