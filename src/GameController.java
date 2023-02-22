import java.util.Scanner;

public class GameController {
    AlphabetDisplay alphabetDisplay;
    WordDisplay wordDisplay;
    Gallows gallows;
    Alphabet alphabet;

    GameController(AlphabetDisplay ad, WordDisplay wd, Gallows g) {
        this.alphabetDisplay = ad;
        this.wordDisplay = wd;
        this.gallows = g;
        this.alphabet = new Alphabet();

    }

    void playGame(Word w) {
        //Contador de intents fallits
        //int contador = 5;

        while (!w.isGuessed() && !gallows.isHung()) {
            //Mostrar paraula sense dir quina paraula intentem adivinar
            wordDisplay.display(w);
            gallows.display();
            alphabetDisplay.display(alphabet);

            //Demanar a l'usuari que escrigui una lletra.
            char c;
            do {
                //falta cosa
                c = getInput();
            } while (alphabet.doGuess(c));


            //Va guardant les lletres
            alphabet.doGuess(c);
            w.doGuess(c); //li pasa la lletra
            boolean encert = w.doGuess(c);

            if (encert) {
                System.out.println("Molt bé");
            } else {
                gallows.addPart();
                //contador--;
                //  System.out.println("Intents restants :" + contador);
            }
            if (gallows.isHung()) {
                //Si se ha quedat sense intents Dibuixa Ahorcado
                gallows.display();
            } else {
                wordDisplay.display(w);
            }


        }

        System.out.println("FI !");
    }

    private char getInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Escriu una lletra: ");
        String line = s.nextLine();
        return line.toUpperCase().charAt(0);
       /* Scanner s = new Scanner(System.in);
        System.out.println("Escriu una lletra: ");
        String line = "";
        do {
            System.out.println("Escriu una lletra: ");
            s.nextLine();
        } while (!goodInput(line));
            return line.toUpperCase().charAt(0);


        */
    }

    private boolean goodInput(String line) {
        if (line.length() != 1) return false;
        char c = line.toUpperCase().charAt(0);
        if (c =='Ç' || c == 'Ñ' ||c == 'A')
        if (c < 'A' || c > 'Z') return false;
        return true;
    }
}
