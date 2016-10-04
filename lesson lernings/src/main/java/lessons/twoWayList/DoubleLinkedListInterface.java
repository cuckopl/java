package lessons.twoWayList;

/**
 * Created by pol on 2016-10-03.
 */
public interface DoubleLinkedListInterface {

    public void add(DoubleLinkedNodeInterface node);

    public void update(int index, DoubleLinkedNodeInterface node);

    public void remove(int index);

    public int size();

    public DoubleLinkedNodeInterface get(int index);


}
