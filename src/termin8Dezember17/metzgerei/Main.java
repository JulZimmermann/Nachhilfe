package termin8Dezember17.metzgerei;

public class Main {

    public static void main(String[] args) {

        Metzgerei metzgereiMeier = new Metzgerei();

        Kaese ementaler = new Kaese("Ementaler", 4, "Kuh");
        Kaese gauder = new Kaese("Gauder", 7, "Kuh");

        metzgereiMeier.hinzufuegenKaese(gauder);
        metzgereiMeier.hinzufuegenKaese(ementaler);

        Kaese gefundeneGauder = metzgereiMeier.entferneKaese("Gauder");
        System.out.println(gefundeneGauder.getName());

    }

}
