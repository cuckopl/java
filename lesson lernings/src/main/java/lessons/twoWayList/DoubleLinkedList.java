package lessons.twoWayList;

import com.sun.xml.internal.bind.v2.TODO;

/**
 * Created by pol on 2016-10-03.
 */
public class DoubleLinkedList extends AbstractDoubleLinkedList {

    private DoubleLinkedNodeInterface headNode = null;
    private DoubleLinkedNodeInterface tailNode = null;

    private DoubleLinkedNodeInterface currentNode = null;
    private int currentPosition;

    private int size = 0;

    private void setHeadNode(DoubleLinkedNodeInterface head) {
        this.headNode = head;
    }

    public int decremntSize() {
        return --size;
    }

    public int incrementSize() {
        return ++size;
    }

    public void add(DoubleLinkedNodeInterface node) {
        if (headNode == null) {
            this.setHeadNode(node);
        } else {
            this.headNode.setNext(node);
        }
        incrementSize();
    }

    public void set(int index, DoubleLinkedNodeInterface node) {

    }

    public void remove(int index) {

    }

    public void remove() {
    }

    public void size(DoubleLinkedNodeInterface node) {

    }

    public DoubleLinkedNodeInterface get(int index) {
        return null;
    }

}
