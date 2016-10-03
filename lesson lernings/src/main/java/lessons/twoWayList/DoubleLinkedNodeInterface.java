package lessons.twoWayList;

/**
 * Created by pol on 2016-10-03.
 */
public interface DoubleLinkedNodeInterface {


    public void setNext(DoubleLinkedNodeInterface next);
    public void setPrev(DoubleLinkedNodeInterface next);

    public DoubleLinkedNode getNext();
    public DoubleLinkedNode getPrev();

    public void setData(String data);

}
