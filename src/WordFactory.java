public interface WordFactory {
    Word makeWord();
}

class DefaultWordFactory implements WordFactory {
    public Word makeWord() {
        Word word = new Word("LICEU");
        return word;
    }
}


class DictWordFactory implements WordFactory {
    @Override
    public Word makeWord() {

        String[] llista =  {
                "TAULA","POMA","AVIO","CAMIO","FINESTRA","TECLAT","ESCOLA","MOTOR","ROBOT","AMOR", "FAMILIA","ALEGRIA","MOTIVACIO"
        };

        // Torna una paraula aleatoria
        int index  = (int) (Math.random()* llista.length);
        return new Word(llista[index]);
    }
}