import java.util.Scanner;

public class HangMan {
    WordFactory wordFactory;
    HangMan(WordFactory wf) {
        this.wordFactory= wf;
    }

    public void play() {
        //Triem una paraula
        Word word = wordFactory.makeWord();
        // Construim els objectes necesaris per inicialitzar
        // gamecontroller
        Gallows g = new TextGallows();
        AlphabetDisplay ad = new TextAlphabetDisplay();
        WordDisplay wd = new TextWordDisplay();
        GameController gc = new GameController(ad, wd ,g);

        // Cridam a la funcio playGame de gamecontroller, i li
        // pasam la paraula que hem triat per jugar
        gc.playGame(word);
    }

    public static void main(String[] args) {
        //Scanner scanner = new Scanner()
        WordFactory wf = new DictWordFactory();
        HangMan h = new HangMan(wf);
        h.play();
    }
}






