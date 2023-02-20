public interface WordDisplay {
    void display(Word w);
}

class TextWordDisplay implements WordDisplay {
    public void display(Word w) {
        System.out.println(w.toString());
    }
}