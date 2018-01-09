package termin5Januar18.blatt10.auto;

public class Auto {

    public String marke;
    public String farbe;

    private int hubraum;

    public Auto(String marke, int hubraum, String farbe) {
        this.marke = marke;
        this.farbe = farbe;

        if(hubraum > 0) {
            this.hubraum = hubraum;
        } else {
            this.hubraum = 1600;
        }
    }

    public int getHubraum() {
        return hubraum;
    }

    public void setHubraum(int hubraum) {
        if(hubraum > 0) {
            this.hubraum = hubraum;
        }
    }


}
