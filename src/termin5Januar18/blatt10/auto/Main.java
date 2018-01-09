package termin5Januar18.blatt10.auto;

public class Main {

    public static void main(String[] args) {

        Auto auto1 = new Auto("Audi", 1600, "Blau");
        Auto auto2 = new Auto("VW", 2000, "Rot");
        Auto auto3 = new Auto("BMW", 2500, "Weiß");

        Auto bestesAuto = auto1;

        if(auto2.getHubraum() > bestesAuto.getHubraum()) {
            bestesAuto = auto2;
        }

        if(auto3.getHubraum() > bestesAuto.getHubraum()) {
            bestesAuto = auto3;
        }


        System.out.println("Das beste Auto ist der " + bestesAuto.marke);
    }

}
