package termin8Dezember17.metzgerei;

public class Wurst {

    private String name;
    private int fettGehalt;
    private boolean bio;

    public Wurst(String name, int fettGehalt, boolean bio) {
        this.name = name;
        this.fettGehalt = fettGehalt;
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFettGehalt() {
        return fettGehalt;
    }

    public void setFettGehalt(int fettGehalt) {
        this.fettGehalt = fettGehalt;
    }

    public boolean isBio() {
        return bio;
    }

    public void setBio(boolean bio) {
        this.bio = bio;
    }
}
