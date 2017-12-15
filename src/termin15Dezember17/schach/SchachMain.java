package termin15Dezember17.schach;

import java.util.Scanner;

public class SchachMain {

    public static void main(String[] args) {
        Schach schach = new Schach();

        Scanner scanner = new Scanner(System.in);

        boolean weiss = true;

        while(true) {
            schach.print();

            if(weiss) {
                System.out.println("Weiß ist dran");
            } else {
                System.out.println("Schwarz ist dran");
            }

            System.out.print("Von X: ");
            int vonX = scanner.nextInt();
            System.out.print("Von Y: ");
            int vonY = scanner.nextInt();
            System.out.print("Nach X: ");
            int nachX = scanner.nextInt();
            System.out.print("Nach X: ");
            int nachY = scanner.nextInt();

            boolean erfolg;

            if(weiss) {
                erfolg = schach.bewegeWeiss(vonX, vonY, nachX, nachY);
            } else {
                erfolg = schach.bewegeSchwarz(vonX, vonY, nachX, nachY);
            }

            if(erfolg) {
                weiss = !weiss;
            }

            System.out.println();
        }

    }

}
