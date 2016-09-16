package helpers;

/**
 * @author Krzysztof Chmielewski
 */
public class SimpleList {
    private Node head;
    private int size;

    public SimpleList() {
    }

    public SimpleList(Object value) {
        head = new Node(value);
        size = 1;
    }

    public void add(Object value) {
        if (head == null) {
            head = new Node(value);
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(value);
        size++;
    }

    public Object get(int index) {
        ensureValidIndex(index);
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.value;
    }

    public int getSize() {
        return size;
    }

    public void remove(int index) {
        ensureValidIndex(index);
        size--;
        if (index == 0) {
            head = head.next;
            return;
        }
        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        current.next = current.next.next;
    }

    private void ensureValidIndex(int index) {
        if (size <= index) {
            throw new IllegalArgumentException(String.format("Index '%s' must be lower than current size '%s'",
                    index, size));
        }
    }

    private class Node {
        private Node next;
        private Object value;

        private Node(Object value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value.toString();
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("SimpleList of size ");
        builder.append(size);
        builder.append(" and elements: ");

        builder.append('[');
        for (Node current = head; current != null; current = current.next) {
            builder.append(current);
            builder.append(", ");
        }
        builder.delete(builder.lastIndexOf(", "), builder.length());
        builder.append(']');

        return builder.toString();
    }
}
