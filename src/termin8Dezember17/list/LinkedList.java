package termin8Dezember17.list;

public class LinkedList {

    private Node start;

    public boolean vertauscheStartEnde() {
        if(start == null) {
            return false;
        }

        int count = 1;
        Node before = null;
        Node currentNode = start;

        while (currentNode.getNext() != null) {
            count++;
            before = currentNode;
            currentNode = currentNode.getNext();
        }

        if(count < 2) {
            return false;
        }

        Node last = currentNode;
        Node preLast = before;

        last.setNext(start.getNext());
        preLast.setNext(start);
        start.setNext(null);
        start = last;

        return true;
    }

}
