package lessons.twoWayList;

/**
 * Created by pol on 2016-10-03.
 */
public class Main {

    public static void main (String args[]){

        DoubleLinkedListInterface testList = new DoubleLinkedList();

        DoubleLinkedNodeInterface testNode1 = new DoubleLinkedNode("Ploow list hard 1");
        DoubleLinkedNodeInterface testNode2 = new DoubleLinkedNode("Ploow list hard 2");
        DoubleLinkedNodeInterface testNode3 = new DoubleLinkedNode("Ploow list hard 3");

        testList.add(testNode1);
        testList.add(testNode2);
        testList.add(testNode3);

        testList.remove(1);
        testList.remove(1);
        System.out.print("ok");

    }
}
