package termin28November17.kalender;

public class KalenderMain {

    public static void main(String[] args) {

        Kalender kalender = new Kalender();

        for(int i = 0; i < 5; i++) {
            int zufalsMonat = (int)(Math.random() * (13 - 1) + 1);
            int zufalsTag = (int)(Math.random() * (32 - 1) + 1);

            kalender.setzeTermin(zufalsMonat, zufalsTag);
            System.out.println("Setzte Termin für den " + zufalsTag + "." + zufalsMonat + ".");
        }

        for(int i = 0; i < 5; i++) {
            int zufalsMonat = (int)(Math.random() * (13 - 1) + 1);
            int zufalsTag = (int)(Math.random() * (32 - 1) + 1);

            boolean termin = kalender.istTermin(zufalsMonat, zufalsTag);
            if(termin) {
                System.out.println("Am " + zufalsTag + "." + zufalsMonat + ". ist ein Termin");
            } else {
                System.out.println("Am " + zufalsTag + "." + zufalsMonat + ". ist kein Termin");

            }
        }

    }

}
