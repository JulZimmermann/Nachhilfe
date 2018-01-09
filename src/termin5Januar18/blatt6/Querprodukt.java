package termin5Januar18.blatt6;

import java.util.Scanner;

public class Querprodukt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int zahl = 0;
        boolean gueltig = false;

        while(!gueltig) {
            System.out.print("Bitte geben Sie eine Zahl ein: ");
            zahl = scanner.nextInt();

            if(zahl >= 0 && zahl <= 1000000) {
                gueltig = true;
            } else {
                System.out.println("FEHLER - Zahl ist ungültig!");
            }
        }

        int queprodukt = berechneQuerprodukt(zahl);

        System.out.println("Das Querprodukt der Zahl " + zahl + " beträgt " + queprodukt);
    }

    private static int berechneQuerprodukt(int zahl) {
        int produkt = 1;

        while (zahl > 0) {
            int stelle = zahl % 10;

            produkt *= stelle;
            zahl /= 10;
        }

        return produkt;
    }

}
