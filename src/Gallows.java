public abstract class Gallows {

    //Punts
    int pointsLeft = 5;

    void display() {
        System.out.printf("Gallows: Points left %d\n", pointsLeft);
    }

    void addPart() {


        pointsLeft--;
    }

    boolean isHung() {
        System.out.print("GAME OVER");
        System.out.println(" ==============  ");
        System.out.println(" _______________");
        System.out.println(" |              |");
        System.out.println(" |             [¨]");
        System.out.println(" |              |");
        System.out.println(" |             / | ");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");

        System.out.println();

        return pointsLeft < 0;
    }
}


class TextGallows extends Gallows {
    void display() {
    }
}