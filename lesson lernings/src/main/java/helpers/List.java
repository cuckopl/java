package helpers;

/**
 * Created by Paweł Cudziło on 2016-09-14.
 */
public class List {


    private Node head = null;
    private int itemCount;

    public List() {
        itemCount = 0;
    }

    protected void incremetnItemCount() {
        ++itemCount;
    }


    protected void decremnetItemCount() {
        --itemCount;
    }


    protected void checkListHaveItems(int index) {
        if (index > itemCount || itemCount == 0) {
            throw new IllegalArgumentException("List don't have so many elements.");
        }
    }

    public int getItemCount() {
        return itemCount;
    }

    /**
     * @param node
     * @return
     */
    public int add(Node node) {
        if (head == null) {
            head = node;
        } else {
            head.setNext(node);
        }
        incremetnItemCount();
        return getItemCount();
    }

    public void remove(int index) {

        //this doesn't work good
        /**
         * I wirte that beacuse i want to see what is happening
         *This will work also
         Node first =   get(index-1);
         Node toDelete = first.getNext();
         Node second   = toDelete.getNext();
         *
         */

        //if first element get anothere element to first position
        checkListHaveItems(index);
        if (index == 1) {
            head = head.getNext();
            decremnetItemCount();
            return;
        }

        // if last element
        Node current = head;
        if (getItemCount() == index) {
            current = current.getNext();
            //Tricky and bumpy !!
            while (current.getNext().getNext() != null) {
                current = current.getNext();
            }
            //remove last element
            current.setNext(null);
            decremnetItemCount();
            return;
        }

        Node first = get(index - 1);
        Node toDelete = get(index);
        Node second;
        try {
            // id its last item return null
            second = get(index + 1);
        } catch (IllegalArgumentException e) {
            //we want to delete last item so we
            second = null;
        }
        first.replaceNext(second);
        decremnetItemCount();
    }

    /**
     * @param index
     * @return
     * @throws IllegalArgumentException
     */
    public Node get(int index) throws IllegalArgumentException {
        checkListHaveItems(index);
        Node current = head;

        //if first element
        if (index == 1) {
            return head;
        }
        //if last element
        if (getItemCount() == index) {
            current = current.getNext();
            while (current.getNext() != null) {
                current = current.getNext();
            }
            return current;
        }

        //any othere elements that we have in list
        for (int i = 0; i < index && current.getNext() != null; i++) {
            current = current.getNext();
        }
        return current;
    }


}
