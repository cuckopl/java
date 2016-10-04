package lessons.twoWayList;

/**
 * Created by pol on 2016-10-03.
 */


public class DoubleLinkedNode implements DoubleLinkedNodeInterface {

    private DoubleLinkedNodeInterface next = null;
    private DoubleLinkedNodeInterface prev = null;
    private String data;

    public DoubleLinkedNode(String data) {
        this.data = data;
    }

    public void addNext(DoubleLinkedNodeInterface node) {
        if (this.next == null) {
            this.next = node;
            node.setPrev(this);
        } else {
            this.next.addNext(node);
        }
    }

    public void setNext(DoubleLinkedNodeInterface node) {
        next = node;
    }

    public void setPrev(DoubleLinkedNodeInterface node) {
        prev = node;
    }

    public DoubleLinkedNodeInterface getNext() {
        return next;
    }

    public DoubleLinkedNodeInterface getPrev() {
        return prev;
    }

    public void setData(String data) {
        this.data = data;
    }

}
