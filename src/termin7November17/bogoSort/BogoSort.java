package termin7November17.bogoSort;

public class BogoSort {

    // Teilaufgabe a

    private int[] array;

    public BogoSort(int[] array) {
        this.array = array;
    }

    //Teilaufgabe b

    public void mischen() {
        int z1 = (int) (Math.random() * array.length);
        int z2 = (int) (Math.random() * array.length);

        if(z1 == z2) {
            mischen();
        } else {
            int x = array[z1];
            array[z1] = array[z2];
            array[z2] = x;
        }
    }

    // Teilaufgabe c

    public void ausgabe() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Teilaufgabe d

    public boolean aufsteigend() {
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i+1] < array[i]) {
                return false;
            }
        }
        return true;
    }

    // Teilaufgabe e

    public int sortieren() {
        int count = 0;
        while (!aufsteigend()) {
            mischen();
            count++;
        }

        return count;
    }

}
