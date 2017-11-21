package termin21November17;

public class MethodenKonzepte {

    public static void main(String[] args) {

        int ergebnisAddition = addieren(1, 2);
        String ergebnisVerketten = verketten("Hallo", "Welt");

        System.out.println(ergebnisAddition);
        System.out.println(ergebnisVerketten);

    }

    public static int addieren(int a , int b) {
        int erg = a + b;

        return erg;
    }

    public static String verketten(String a, String b) {
        return a + b;
    }


}
