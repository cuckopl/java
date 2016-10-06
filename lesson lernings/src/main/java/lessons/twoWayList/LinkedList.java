package lessons.twoWayList;

/**
 * Created by pol on 2016-10-03.
 */

public class LinkedList extends AbstractLinkedList {


    protected static final int START_COUNT = 0;
    private LinkedNodeInterface headNode = null;
    private LinkedNodeInterface tailNode = null;

    private LinkedNodeInterface currentNode = null;

    private int size = 0;


    private void ensureIndexIsValid(int index) {
        if (size <= index) {
            throw new IllegalArgumentException(String.format("Index '%s' couldn't be lower or equal 0 and bigger than current size '%s'",
                    index, size));
        }
    }

    private void setHeadNode(LinkedNodeInterface head) {
        this.headNode = head;
    }

    private void addToEndOfList(LinkedNodeInterface node) {
        if (tailNode == null) {
            tailNode = node;
            tailNode.setPrev(headNode);
            headNode.setNext(node);
        } else {
            node.setPrev(tailNode);
            tailNode.setNext(node);
            tailNode = node;
        }
    }

    private void removeHead() {
        if (headNode.getNext() != null) {
            headNode = headNode.getNext();
            headNode.setPrev(null);
        } else {
            headNode = null;
        }
    }

    private void removeMiddleNode(LinkedNodeInterface node) {
        node.getPrev().setNext(node.getNext());
        node.getNext().setPrev(node.getPrev());
    }

    private void removeTailNode() {
        tailNode.setNext(tailNode.getPrev());
    }

    private LinkedNodeInterface findNodeByIndex(int index) {
        ensureIndexIsValid(index);
        currentNode = headNode;
        int currentPosition = START_COUNT;
        boolean elemntFinded = false;

        while (!elemntFinded) {
            if (currentPosition == index) {
                elemntFinded = true;
            }else{
                currentNode = currentNode.getNext();
                currentPosition++;
            }

        }


        return currentNode;
    }

    protected int decremntSize() {
        return --size;
    }

    protected int incrementSize() {
        return ++size;
    }

    public void add(LinkedNodeInterface node) {
        if (headNode == null) {
            setHeadNode(node);
        } else {
            addToEndOfList(node);
            //or slower solution
            //    headNode.addNext(node);
        }
        incrementSize();
    }

    public void update(int index, LinkedNodeInterface node) {
        currentNode = findNodeByIndex(index);
        currentNode.getPrev().setNext(node);
        if (currentNode.getNext() != null) {
            currentNode.getNext().setPrev(node);
        }
    }

    public void remove(int index) {
        if (index == START_COUNT) {
            removeHead();
        }
        if (index == size()) {
            removeTailNode();
        }

        if (index != size() && index != START_COUNT) {
            removeMiddleNode(findNodeByIndex(index));
        }

        decremntSize();
    }

    public int size() {
        return size;
    }

    public LinkedNodeInterface get(int index) {
        return findNodeByIndex(index);
    }

}
