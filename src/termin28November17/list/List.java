package termin28November17.list;

public class List {

    Knoten start;

    String[] toArray() {

        int size = count();
        String[] array = new String[size];

        copyToArrayFor(array);

        return array;
    }

    private void copyToArrayWhile(String[] array) {
        int count = 0;
        Knoten aktuellerKnoten = start;
        while (aktuellerKnoten != null) {
            array[count] = aktuellerKnoten.string;
            count++;
            aktuellerKnoten = aktuellerKnoten.next;
        }
    }

    private void copyToArrayFor(String[] array) {
        Knoten aktuellerKnoten = start;
        for(int i = 0; i <array.length; i++) {
            array[i] = aktuellerKnoten.string;
            aktuellerKnoten = aktuellerKnoten.next;
        }
    }

    private int count() {
        int count = 0;
        Knoten aktuellerKnoten = start;
        while (aktuellerKnoten != null) {
            count++;
            aktuellerKnoten = aktuellerKnoten.next;
        }

        return count;
    }


}
