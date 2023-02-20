import java.util.Scanner;

public class GameController {
    AlphabetDisplay alphabetDisplay;
    WordDisplay wordDisplay;
    Gallows gallows;

    GameController(AlphabetDisplay ad, WordDisplay wd, Gallows g) {
        this.alphabetDisplay = ad;
        this.wordDisplay = wd;
        this.gallows = g;

    }

    void playGame(Word w) {
        while (!w.isGuessed()) {
            //Mostrar paraula sense dir quina paraula intentem adivinar
            wordDisplay.display(w);

            //Demanar a l'usuari que escrigui una lletra.
            char c = getInput();
            w.doGuess(c); //li pasa la lletra
            boolean encert = w.doGuess(c);
            if (encert) {
                System.out.println("Molt bé");
            } else {
                System.out.println("NOOOO");
            }
        }
        System.out.println("FIII");
    }

    private char getInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Escriu una lletra: ");
        String line = s.nextLine();
        return line.toUpperCase().charAt(0);
    }
}
