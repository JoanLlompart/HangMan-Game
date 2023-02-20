public class Alphabet {

    String usedLetters = "";
    public boolean isUsed(char c) {
        //Guarda la lletra que has empleat per sebre
        //
        // les lletres que se han empleat

        return usedLetters.contains(""+c);
    }

    public boolean doGuess(char c) {
        // LLetres que
        boolean res= usedLetters.contains(""+c);
        if (!res) usedLetters += c;
        return res;
    }
}


interface AlphabetDisplay {
    void display(Alphabet a);
}

class TextAlphabetDisplay implements AlphabetDisplay {
    public void display(Alphabet a) {
        //Mostra les lletres que hem anat posant
        System.out.println("Lletres emprades: " + a.usedLetters);
    }
}