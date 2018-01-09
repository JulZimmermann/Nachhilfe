package termin5Januar18.blatt6;

import java.util.Scanner;

public class Potenz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        int b = scanner.nextInt();

        double erg = 0;

        if(b > 0) {
            erg = berechenPotenz(a, b);
        }

        if(b == 0) {
            erg = 1;
        }

        if(b < 0) {
            erg = 1 / berechenPotenz(a, b);
        }

        System.out.println("Ergebnis: " + erg);
    }

    private static double berechenPotenz(double a, int b) {
        double produkt = 1;

        for(int i = 0; i < b; i++) {
            produkt *= a;
        }

        return produkt;
    }

}
