package termin28November17.kalender;

public class Kalender {

    private boolean[][] kalender = new boolean[12][];

    public Kalender() {
        kalender[0] = new boolean[31];
        kalender[1] = new boolean[28];
        kalender[2] = new boolean[31];
        kalender[3] = new boolean[30];
        kalender[4] = new boolean[31];
        kalender[5] = new boolean[30];
        kalender[6] = new boolean[31];
        kalender[7] = new boolean[31];
        kalender[8] = new boolean[30];
        kalender[9] = new boolean[31];
        kalender[10] = new boolean[30];
        kalender[11] = new boolean[31];
    }

    public boolean istTermin(int monat, int tag) {
        boolean gueltig = checkParameter(monat, tag);

        if(gueltig) {
            return kalender[monat - 1][tag - 1];
        }

        return false;
    }

    public void setzeTermin(int monat, int tag) {
        boolean gueltig = checkParameter(monat, tag);

        if(gueltig) {
            kalender[monat - 1][tag - 1] = true;
        }
    }

    public void entferneTermin(int monat, int tag) {
        boolean gueltig = checkParameter(monat, tag);

        if(gueltig) {
            kalender[monat-1][tag-1] = false;
        }
    }

    private boolean checkParameter(int monat, int tag) {
        if(monat < 1 || monat > 12) {
            System.out.println("Der Monat " + monat + " existiert nicht!");
            return false;
        }

        if(tag < 1 || tag > kalender[monat-1].length) {
            System.out.println("Der Monat " + monat + " hat keine Tag " + tag);
            return false;
        }

        return true;
    }

}
