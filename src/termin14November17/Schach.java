package termin14November17;

public class Schach {

    boolean[][] brett = new boolean[8][8];

    void setzeTurm(int x, int y) {
        for(int i = 0; i < brett.length; i++) {
            brett[x][i] = true;
            brett[i][y] = true;
        }

    }

    void ausgabe() {
        for(int i = 0; i < brett.length; i++) {
            for(int j = 0; j < brett.length; j++) {
                System.out.print(brett[i][j] ? 'X' : 'O');
            }
            System.out.println();
        }
    }

}
