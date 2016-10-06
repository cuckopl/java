package lessons.twoWayList;

/**
 * Created by pol on 2016-10-03.
 */
public interface LinkedListInterface {

    public void add(LinkedNodeInterface node);

    public void update(int index, LinkedNodeInterface node);

    public void remove(int index);

    public int size();

    public LinkedNodeInterface get(int index);




}
