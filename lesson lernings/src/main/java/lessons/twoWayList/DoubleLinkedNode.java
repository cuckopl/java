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

    public void setNext(DoubleLinkedNodeInterface node) {
        if (this.next == null) {
            this.next = node;
            node.setPrev(this);
        } else {
            this.next.setNext(node);
        }
    }

    public void setPrev(DoubleLinkedNodeInterface node) {
        prev = node;
    }

    public DoubleLinkedNode getNext() {
        return null;
    }

    public DoubleLinkedNode getPrev() {
        return null;
    }

    public void setData(String data) {
        this.data = data;
    }

}
