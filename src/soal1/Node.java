package soal1;// { Driver Code Starts

import java.util.*;

class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}



/* Node is defined as
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    // Print elements of a linked list on console
    // head pointer input could be NULL as well
    // for empty list
    void display(Node head) {

        countLinkedList(head).forEach(
                integer -> {
                    System.out.print(String.valueOf(integer));
                }
        );
    }

    LinkedList<Integer> countLinkedList(Node head){
            LinkedList<Integer> value = new LinkedList<>();
            Node current = head;
            value.add(head.data);
            while (current.next != null){
                current = current.next;
                value.add(current.data);
            }
            return value;
    }

}