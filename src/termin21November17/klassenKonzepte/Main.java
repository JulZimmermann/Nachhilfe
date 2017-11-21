package termin21November17.klassenKonzepte;

public class Main {

    public static void main(String[] args) {

        Auto a = new Auto();
        Auto b = new Auto(100, "Blau", "WÜ-123", AutoTyp.SPORTWAGEN);
        a.setPs(1000);

        System.out.println(a.getPs());
        System.out.println(b.getPs());

    }

}
