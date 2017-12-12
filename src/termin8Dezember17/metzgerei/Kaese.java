package termin8Dezember17.metzgerei;

public class Kaese {

    private String name;
    private int wuerzFaktor;
    private String milchArt;

    public Kaese(String name, int wuerzFaktor, String milchArt) {
        this.name = name;
        setWuerzFaktor(wuerzFaktor);
        setMilchArt(milchArt);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWuerzFaktor() {
        return wuerzFaktor;
    }

    public void setWuerzFaktor(int wuerzFaktor) {
        if(wuerzFaktor > 0 && wuerzFaktor < 11) {
            this.wuerzFaktor = wuerzFaktor;
        } else {
            System.out.println("Ungültiger Würzfaktor");
        }
    }

    public String getMilchArt() {
        return milchArt;
    }

    public void setMilchArt(String milchArt) {
        if(milchArt.equals("Kuh") || milchArt.equals("Ziege")) {
            this.milchArt = milchArt;
        } else {
            System.out.println("Ungültige Milchart!");
        }

    }
}
