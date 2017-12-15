package termin15Dezember17.schachLive;

public class Schach {

    private SchachFigur[][] feld = new SchachFigur[8][8];

    public Schach() {
        feld[0][0] = new SchachFigur("Schwarz", "Turm");
        feld[0][1] = new SchachFigur("Schwarz", "Springer");
        feld[0][2] = new SchachFigur("Schwarz", "Läufer");
        feld[0][3] = new SchachFigur("Schwarz", "Dame");
        feld[0][4] = new SchachFigur("Schwarz", "König");
        feld[0][5] = new SchachFigur("Schwarz", "Läufer");
        feld[0][6] = new SchachFigur("Schwarz", "Springer");
        feld[0][7] = new SchachFigur("Schwarz", "Turm");

        feld[7][0] = new SchachFigur("Weiß", "Turm");
        feld[7][1] = new SchachFigur("Weiß", "Springer");
        feld[7][2] = new SchachFigur("Weiß", "Läufer");
        feld[7][3] = new SchachFigur("Weiß", "Dame");
        feld[7][4] = new SchachFigur("Weiß", "König");
        feld[7][5] = new SchachFigur("Weiß", "Läufer");
        feld[7][6] = new SchachFigur("Weiß", "Springer");
        feld[7][7] = new SchachFigur("Weiß", "Turm");

        for(int i = 0; i < 8; i++) {
            feld[1][i] = new SchachFigur("Schwarz", "Bauer");
            feld[6][i] = new SchachFigur("Weiß", "Bauer");
        }
    }

    public boolean bewegeWeiss(int vonX, int vonY, int nachX, int nachY) {
        return bewege("Weiß", vonX,vonY, nachX, nachY);
    }

    public boolean bewegeSchwarz(int vonX, int vonY, int nachX, int nachY) {
        return bewege("Schwarz", vonX,vonY, nachX, nachY);
    }


    public void print() {
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                SchachFigur figur = feld[i][j];
                if(figur != null) {
                    System.out.print("" + figur.getFarbe().charAt(0) + figur.getTyp().charAt(0) + " ");
                } else {
                    System.out.print("-- ");
                }
            }
            System.out.println();
        }
    }

    private boolean bewege(String farbe, int vonX, int vonY, int nachX, int nachY) {
        if (feld[vonX][vonY] == null || !feld[vonX][vonY].getFarbe().equals(farbe)) {
            System.out.println("Keine " + farbe + "e Figur!");
            return false;
        }

        if (feld[nachX][nachY] != null && feld[nachX][nachY].getFarbe().equals(farbe)) {
            System.out.println("Würde " + farbe + "e Figur schmeißen!");
            return false;
        }

        feld[nachX][nachY] = feld[vonX][vonY];
        feld[vonX][vonY] = null;

        return true;
    }

}
