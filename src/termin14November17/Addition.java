package termin14November17;

public class Addition {

    public static void main(String[] args) {

        int[] a = {9, 9, 9};
        int[] b = {9, 9, 9};

        int[] erg = addiere(a, b);

        for(int i = 0; i < erg.length; i++) {
            System.out.print(erg[i]);
        }

    }

    static int[] addiere(int[] a, int[] b) {

        int[] erg = new int[a.length];

        int uebertrag = 0;
        for(int i = a.length - 1; i >= 0; i--) {
            int sum = a[i] + b[i];

            int number = sum % 10;
            erg[i] = number + uebertrag;

            uebertrag = sum / 10;
        }

        if(uebertrag == 1) {
            int[] ergN = new int[erg.length+1];
            ergN[0] = 1;

            for(int i = 0; i < erg.length; i++) {
                ergN[i+1] = erg[i];
            }

            return ergN;
        }

        return erg;
    }

}
