public abstract class Gallows {
    int pointsLeft = 5;

    void display() {
        System.out.printf("Gallows: Points left %d\n", pointsLeft);
    }

    void addPart() {
        pointsLeft--;
    }

    boolean isHung() {
        return pointsLeft < 0;
    }
}


class TextGallows extends Gallows {
    void display() {
    }
}