package lessons.twoWayList;

import com.sun.xml.internal.bind.v2.TODO;

/**
 * Created by pol on 2016-10-03.
 */

public class DoubleLinkedList extends AbstractDoubleLinkedList {


    protected static final int START_COUNT = 1;
    private DoubleLinkedNodeInterface headNode = null;
    private DoubleLinkedNodeInterface tailNode = null;

    private DoubleLinkedNodeInterface currentNode = null;

    private int size = 0;


    private void ensureIndexIsValid(int index) {
        if (size > index && index <= 0) {
            throw new IllegalArgumentException(String.format("Index '%s' couldn't be lower or equal 0 and bigger than current size '%s'",
                    index, size));
        }
    }

    private void setHeadNode(DoubleLinkedNodeInterface head) {
        this.headNode = head;
    }

    private void addToEndOfList(DoubleLinkedNodeInterface node) {
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

    private void removeMiddleNode(DoubleLinkedNodeInterface node) {
        node.getPrev().setNext(node.getNext());
        node.getNext().setPrev(node.getPrev());
    }

    private void removeTailNode() {
        tailNode.setNext(tailNode.getPrev());
    }

    private DoubleLinkedNodeInterface findNodeByIndex(int index) {
        ensureIndexIsValid(index);
        currentNode = headNode;
        int currentPosition = START_COUNT;
        boolean elemntFinded = false;

        while (!elemntFinded) {
            if (currentPosition == index) {
                elemntFinded = true;
            }
            currentNode = currentNode.getNext();
            currentPosition++;
        }


        return currentNode;
    }

    protected int decremntSize() {
        return --size;
    }

    protected int incrementSize() {
        return ++size;
    }

    public void add(DoubleLinkedNodeInterface node) {
        if (headNode == null) {
            setHeadNode(node);
        } else {
            addToEndOfList(node);
            //or slower solution
            //    headNode.addNext(node);
        }
        incrementSize();
    }

    public void update(int index, DoubleLinkedNodeInterface node) {
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

    public DoubleLinkedNodeInterface get(int index) {
        return findNodeByIndex(index);
    }

}
