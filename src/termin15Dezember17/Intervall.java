package termin15Dezember17;

public class Intervall {

    public boolean[] intervallCheck(int numb, int[][] range) {

        boolean[] arr = new boolean[range.length];

        for(int i = 0; i < range.length; i++) {
            arr[i] = numb >= range[i][0] && numb <= range[i][1];
        }

        return arr;
    }

}
