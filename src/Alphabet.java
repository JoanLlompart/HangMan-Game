public class Alphabet {
    public boolean isUsed(char c) {
        return false;
    }

    public boolean doGuess(char c) {
        return false;
    }
}


interface AlphabetDisplay {
    void display(Alphabet a);
}

class TextAlphabetDisplay implements AlphabetDisplay {
    public void display(Alphabet a) {
    }
}