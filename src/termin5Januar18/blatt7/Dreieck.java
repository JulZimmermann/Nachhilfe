package termin5Januar18.blatt7;

public class Dreieck {

    public static void main(String[] args) {

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5-i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < i+1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
