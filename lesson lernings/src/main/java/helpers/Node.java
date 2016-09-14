package helpers;

/**
 * Created by Paweł Cudziło on 2016-09-14.
 */
public class Node {

    private Node next = null;


    public String data;


    public Node getNext() {
        return next;
    }

    public void replaceNext(Node node) {
        next = node;
    }

    public void setNext(Node node) {
        if (getNext() == null) {
            next = node;
        } else {
            next.setNext(node);
        }
    }
}
