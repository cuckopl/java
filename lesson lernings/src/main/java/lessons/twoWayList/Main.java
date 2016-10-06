package lessons.twoWayList;

/**
 * Created by pol on 2016-10-03.
 */
public class Main {

    public static void main (String args[]){

        LinkedListInterface testList = new LinkedList();

        LinkedNodeInterface testNode1 = new LinkedNode("Ploow list hard 1");
        LinkedNodeInterface testNode2 = new LinkedNode("Ploow list hard 2");
        LinkedNodeInterface testNode3 = new LinkedNode("Ploow list hard 3");

        testList.add(testNode1);
        testList.add(testNode2);
        testList.add(testNode3);

        testList.remove(1);
        testList.remove(1);
        System.out.print("ok");

    }
}
