package termin7November17.bogoSort;

public class BogoSortMain {

    // Teilaufgabe f

    public static void main(String[] args) {
        int[] array = new int[100];

        for(int i = 0; i < array.length; i++) {
            int z = (int) (Math.random() * (1000000 - 1) + 1);
            array[i] = z;
        }

        BogoSort bogoSort = new BogoSort(array);
        int versuche = bogoSort.sortieren();

        System.out.println(versuche);
    }

}
