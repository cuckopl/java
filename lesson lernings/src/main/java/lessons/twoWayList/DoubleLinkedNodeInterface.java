package lessons.twoWayList;

/**
 * Created by pol on 2016-10-03.
 */
public interface DoubleLinkedNodeInterface {

    public void addNext(DoubleLinkedNodeInterface node);

    public void setNext(DoubleLinkedNodeInterface next);
    public void setPrev(DoubleLinkedNodeInterface next);

    public DoubleLinkedNodeInterface getNext();
    public DoubleLinkedNodeInterface getPrev();


    public void setData(String data);

}
