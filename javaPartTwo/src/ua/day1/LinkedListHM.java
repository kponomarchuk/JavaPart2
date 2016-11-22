package ua.day1;

/**
 * Created by Ksu on 15.11.2016.
 */

import java.util.StringJoiner;

/**
 * Created by red7 on 14.11.2016.
 */
public class LinkedListHM {
    int size = 0;
    Node head;
    Node tail;

    void add(String name) {
        Node node = new Node(name);
        if (size == 0) {
            head = tail = node;
        } else {

            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }

    void get(int index) {

        if (index <= size - 1 && index >= 0) {
            Node temp1 = head;
            for (int i = 0; i < size; i++) {
                if (i != index) {
                    temp1 = temp1.next;
                } else {
                    System.out.println("Value of element with index  " + index + " = " + temp1.value);
                }

            }

        } else {

            System.out.println("Incorrect number of element's index");
        }

    }

    void get2(int index) {
        Node tmpNode = getNode(index);
        if (tmpNode != null) {
                    System.out.println("Value of element with index  " + index + " = " + tmpNode.value);
        }
        else
        {
            System.out.println("incorrect index!!!");
        }

    }

    void remove(int index) {
        Node tmpNode = getNode(index);
        if (tmpNode != null) {
            System.out.println("Value of element with index  " + index + " = " + tmpNode.value);
        }
        else
        {
            System.out.println("incorrect index!!!");
        }

    }



    private Node getNode(int index) {
        Node tmpNode;
        tmpNode = head;
        if (index < size && index >= 0) {
            for (int i = 0; i < index; i++) {
                tmpNode = tmpNode.next;

            }
            System.out.println(tmpNode.value);
            return tmpNode;
        } else {
            //TODO:Add error
            System.out.println("Incorrect number of element's index");
            return null;
        }

    }


    @Override
    public String toString() {
        String result = "size=" + size;
        StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
        Node temp = head;
        for (int i = 0; i < size; i++) {
            stringJoiner.add(temp.value);
            temp = temp.next;
        }
        return result + stringJoiner.toString();
    }
}