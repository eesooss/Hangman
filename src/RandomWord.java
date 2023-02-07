import java.util.Random;

public class RandomWord {
    private String[] words = {"father", "mother", "brother", "eye", "family", "sister", "friend", "likeness", "illness"};
    private String chosenWord;
    private Random random = new Random();
    private char[] characters;

    public RandomWord() {
        chosenWord = words[random.nextInt((words.length))];
        characters = new char[chosenWord.length()];
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();

        for (char c : characters) {
            if (c == '\u0000') {
                sb.append('_');
            } else {
                sb.append(c);
            }

            sb.append(' ');
        }

        return sb.toString();
    }
}
