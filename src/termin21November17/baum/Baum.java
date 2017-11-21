package termin21November17.baum;

public class Baum {

    private int hauptastAnzahl;
    private String type;

    public Baum(int hauptastAnzahl, String type) {
        this.hauptastAnzahl = hauptastAnzahl;

        if(type.equals("Buche") || type.equals("Eiche") || type.equals("Ander")) {
            this.type = type;
        } else {
            System.out.println("Das darfst du nicht!!");
        }

    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "HauptastAnzahl: " + hauptastAnzahl + " Type: " + type;
    }
}
