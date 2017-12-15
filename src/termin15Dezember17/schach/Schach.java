package termin15Dezember17.schach;

public class Schach {

    private static final int LEER = 0;

    private static final int BAUER_WEISS = 1;
    private static final int TURM_WEISS = 2;
    private static final int SPRINGER_WEISS = 3;
    private static final int LAUFER_WEISS = 4;
    private static final int KOENIG_WEISS = 5;
    private static final int DAME_WEISS = 6;

    private static final int BAUER_SCHWARZ = 7;
    private static final int TURM_SCHWARZ = 8;
    private static final int SPRINGER_SCHWARZ = 9;
    private static final int LAUFER_SCHWARZ = 10;
    private static final int KOENIG_SCHWARZ = 11;
    private static final int DAME_SCHWARZ = 12;
    
    private int[][] feld = new int[8][8];

    public Schach() {
        feld[0][0] = TURM_WEISS;
        feld[0][1] = SPRINGER_WEISS;
        feld[0][2] = LAUFER_WEISS;
        feld[0][3] = KOENIG_WEISS;
        feld[0][4] = DAME_WEISS;
        feld[0][5] = LAUFER_WEISS;
        feld[0][6] = SPRINGER_WEISS;
        feld[0][7] = TURM_WEISS;

        feld[7][0] = TURM_SCHWARZ;
        feld[7][1] = SPRINGER_SCHWARZ;
        feld[7][2] = LAUFER_SCHWARZ;
        feld[7][3] = KOENIG_SCHWARZ;
        feld[7][4] = DAME_SCHWARZ;
        feld[7][5] = LAUFER_SCHWARZ;
        feld[7][6] = SPRINGER_SCHWARZ;
        feld[7][7] = TURM_SCHWARZ;

        for(int i = 0; i < 8; i++) {
            feld[1][i] = BAUER_WEISS;
            feld[6][i] = BAUER_SCHWARZ;
        }
    }

    public boolean bewegeWeiss(int vonX, int vonY, int nachX, int nachY) {
        //Prüfen ob von Weiß ist
        if(feld[vonX][vonY] < BAUER_WEISS || feld[vonX][vonY] > KOENIG_WEISS) {
            System.out.println("Auf der gegebenen Position ist keine weiße Figur");
            return false;
        }

        //Prüfen ob nach Weiß ist
        if(feld[nachX][nachY] >= BAUER_WEISS && feld[nachX][nachY] <= KOENIG_WEISS) {
            System.out.println("Zug würde eigene Figur schmeißen");
            return false;
        }

        bewegeFigur(vonX, vonY, nachX, nachY);
        return true;
    }

    public boolean bewegeSchwarz(int vonX, int vonY, int nachX, int nachY) {
        //Prüfen ob von Schwarz ist
        if(feld[vonX][vonY] < BAUER_SCHWARZ || feld[vonX][vonY] > KOENIG_SCHWARZ) {
            System.out.println("Auf der gegebenen Position ist keine schwarze Figur");
            return false;
        }

        //Prüfen ob nach Schwarz ist
        if(feld[nachX][nachY] >= BAUER_SCHWARZ && feld[nachX][nachY] <= KOENIG_SCHWARZ) {
            System.out.println("Zug würde eigene Figur schmeißen");
            return false;
        }

        bewegeFigur(vonX, vonY, nachX, nachY);
        return true;
    }

    public void print() {
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                String text = numberToText(feld[i][j]);
                System.out.print(text + " ");
            }
            System.out.println();
        }
    }

    private String numberToText(int number) {
        if(number == 0 || number % 6 != 0) {
            number = number % 6;
        } else {
            number = 6;
        }

        if(number == LEER) {
            return "--";
        }

        if (number < BAUER_SCHWARZ) {
            return "W" + number;
        }

        return "S" + number;
    }

    private void bewegeFigur(int vonX, int vonY, int nachX, int nachY) {
        feld[nachX][nachY] = feld[vonX][vonY];
        feld[vonX][vonY] = LEER;
    }

}
