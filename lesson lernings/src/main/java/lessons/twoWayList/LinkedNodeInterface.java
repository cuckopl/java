package lessons.twoWayList;

/**
 * Created by pol on 2016-10-03.
 */
public interface LinkedNodeInterface {

    public void addNext(LinkedNodeInterface node);

    public void setNext(LinkedNodeInterface next);
    public void setPrev(LinkedNodeInterface next);

    public LinkedNodeInterface getNext();
    public LinkedNodeInterface getPrev();
    public String getData();

    public void setData(String data);

}
