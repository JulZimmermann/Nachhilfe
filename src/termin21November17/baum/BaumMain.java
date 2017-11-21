package termin21November17.baum;

import java.util.Scanner;

public class BaumMain {

    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);

        Baum[] baume = new Baum[500];

        for(int i = 0; i < 500; i++) {
            System.out.println("Baum " + (i+1) + ": ");

            System.out.print("Anzahl Äste: ");
            int anzahlAeste = scann.nextInt();

            System.out.print("Type: ");
            String type = scann.next();

            Baum baum = new Baum(anzahlAeste, type);
            baume[i] = baum;

            System.out.println(baum);
        }

        Wald wald = new Wald(baume);
    }

}
