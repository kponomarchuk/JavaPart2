package ua.day3;

/**
 * Created by Ksu on 17.11.2016.
 */
public class LinkedListSample {

    int size;
    Node head;
    Node tail;


    public Object get(int index) {
        validateIndex(index);
        return getNode(index).value;
    }


    private Node getNode(int index) {
        Node node;
        if (index < size / 2) {
            node = head;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {
            node = tail;
            for (int i = size - 1; i > index; i--) {
                node = node.prev;
            }
        }
        return node;
    }


    private void validateIndex(int index) {
        if (index < 0 || index >= size) {
            String msg = "Index " + index + " should be between 0 and " + size + " exclusive";
            throw new IndexOutOfBoundsException(msg);
        }
    }




    public int indexOf(Object value) {
        Node node = head;
        for (int index = 0; index < size; index++) {
            if (node.value.equals(value)) {
                return index;
            }
            node = node.next;
        }
        return -1;
    }


    public boolean contains(Object value) {
        return indexOf(value) != -1;
    }


    public Object remove(int index) {
        validateIndex(index);
        Node nodeToRemove = getNode(index);
        if (size == 1) {
            head = tail = null;
        } else if (index == 0) {
            head.next.prev = null;
            head = head.next;
        } else if (index == size - 1) {
            tail.prev.next = null;
            tail = tail.prev;
        } else {
            nodeToRemove.prev.next = nodeToRemove.next;
            nodeToRemove.next.prev = nodeToRemove.prev;
        }


        size--;
        return nodeToRemove.value;
    }


    public void clear() {
        head = tail = null;
        size = 0;
    }


    private static class Node {
        Node next;
        Node prev;
        Object value;


        public Node(Object value) {
            this.value = value;
        }
    }

}
