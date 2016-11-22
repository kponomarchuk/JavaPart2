/**
 * Created by Ksu on 15.11.2016.
 */
package ua.day4;

public class Node {
    Node(String name1){
        System.out.println("Node " +name1+ " created");
        value =name1;
    }
    String value;
    Node next;
    Node prev;
}
