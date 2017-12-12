package termin8Dezember17.list;

public class Node {

    private String name;
    private Node next;

    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
