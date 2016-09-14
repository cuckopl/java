package helpers;

/**
 * Created by Paweł Cudziło on 2016-09-14.
 */
public class List {


    private Node head = null;
    private int itemCount;

    public List() {
        itemCount = 1;
    }

    protected void incremetnItemCount() {
        itemCount++;
    }


    protected void decremnetItemCount() {
        --itemCount;
    }


    protected void checkListHaveItems(int index) {
        if (index >= itemCount) {
            throw new IllegalArgumentException("List don't have so many elements.");
        }
    }

    public int getItemCount() {
        return itemCount;
    }

    /**
     *
     * @param node
     * @return
     */
    public boolean add(Node node) {
        if (head == null) {
            head = node;
        } else {
            head.setNext(node);
        }
        incremetnItemCount();
        return true;
    }

    public void remove(int index) {


        /**
         * I wirte that beacuse i want to see what is happening
         *This will work also
         Node first =   get(index-1);
         Node toDelete = first.getNext();
         Node second   = toDelete.getNext();
         *
         */
        checkListHaveItems(index);
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
     * 
     * @param index
     * @return
     * @throws IllegalArgumentException
     */
    public Node get(int index) throws IllegalArgumentException {
        checkListHaveItems(index);
        Node current = head;
        for (int i = 1; i < index && current.getNext() != null; i++) {
            current = current.getNext();
        }
        return current;
    }


}
