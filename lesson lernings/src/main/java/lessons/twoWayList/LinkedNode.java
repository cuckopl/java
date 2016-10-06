package lessons.twoWayList;

/**
 * Created by pol on 2016-10-03.
 */


public class LinkedNode implements LinkedNodeInterface {

    private LinkedNodeInterface next = null;
    private LinkedNodeInterface prev = null;
    private String data;

    public LinkedNode(String data) {
        this.data = data;
    }

    public void addNext(LinkedNodeInterface node) {
        if (this.next == null) {
            this.next = node;
            node.setPrev(this);
        } else {
            this.next.addNext(node);
        }
    }

    public void setNext(LinkedNodeInterface node) {
        next = node;
    }

    public void setPrev(LinkedNodeInterface node) {
        prev = node;
    }

    public LinkedNodeInterface getNext() {
        return next;
    }

    public LinkedNodeInterface getPrev() {
        return prev;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData(){return data;}

}
