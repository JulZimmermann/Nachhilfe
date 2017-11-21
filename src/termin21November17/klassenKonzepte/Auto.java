package termin21November17.klassenKonzepte;

public class Auto {

    private int ps;
    private String farbe;
    private String kennzeichen;
    private AutoTyp type;

    public Auto() {
        type = AutoTyp.ANDERE;
    }

    public Auto(int ps, String farbe, String kennzeichen, AutoTyp type) {
        this.ps = ps;
        this.farbe = farbe;
        this.kennzeichen = kennzeichen;
        this.type = type;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }
}
