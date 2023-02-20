import java.lang.reflect.Array;
import java.util.Arrays;

public class Word {
    String wordString;
    char[] guions;

    Word(String s) {

        this.wordString = s;
        this.guions = new char[s.length()];
        // Cambia els guions per la lletra
        for (int i = 0; i <s.length() ; i++) {
            this.guions[i] = '-';
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(guions);
    }

    boolean isGuessed() {

        for (int i = 0; i < guions.length; i++) {
            if (guions[i] == '-') return false;

        }
        return true;
    }

    boolean doGuess(char c) {

       /* if (wordString.contains(""+c)) {//comilles per convertir c a String
            return true;
        }
        return false;

        */
        boolean res = false;
        for (int i = 0; i < wordString.length(); i++) {
            if (wordString.charAt(i) == c) {
                guions[i] = c;
                res = true;
            }
        }
        return res;
    }
}


