package termin8Dezember17.metzgerei;

public class Metzgerei {

    private Kaese[] kaese = new Kaese[100];
    private Wurst[] wurst = new Wurst[100];
    private Fleisch[] fleisch = new Fleisch[100];

    public void hinzufuegenKaese(Kaese kaese) {
        for(int i = 0; i < this.kaese.length; i++) {
            if(this.kaese[i] == null) {
                this.kaese[i] = kaese;
                return;
            }
        }

        System.out.println("Das Fleischlager ist voll!");
    }

    public Kaese entferneKaese(String name) {
        for(int i = 0; i < this.kaese.length; i++) {
            if(this.kaese[i] != null && this.kaese[i].getName().equals(name)) {
                Kaese kaese = this.kaese[i];
                this.kaese[i] = null;
                return kaese;
            }
        }

        System.out.println("Fleisch nicht gefunden!");
        return null;
    }

}
