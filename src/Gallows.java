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
      /*  System.out.print("GAME OVER");
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


       */
        System.out.println();

        //Punts igual o mes petits a cero
        return pointsLeft <= 0;
    }
}


class TextGallows extends Gallows {
    String[] graphics = {
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " / \\  |\n" +
                    "      |\n" +
                    "========='"
            ,"  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            " /|\\  |\n" +
            " /    |\n" +
            "      |\n" +
            "=========" ,
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            " +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            " +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            " +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "========="


    };
    @Override
    void display() {
        System.out.println(graphics[pointsLeft]);
    }
}