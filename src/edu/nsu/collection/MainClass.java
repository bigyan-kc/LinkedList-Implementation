package edu.nsu.collection;

public class MainClass {
    public static void main(String []args){
//        System.out.println("Hello World!");
//
//        //Create a LinkedList
//        LinkedList myLinkedList = new LinkedList();
//
//        //Add elements to the LinkedList
//        myLinkedList.addNode(12);
//        myLinkedList.addNode(15);
//        myLinkedList.addNode(0);
//        myLinkedList.addNode(-1);
//
//        //Print the LinkedList
//        myLinkedList.printList();
//
//        //Remove the node from end of the List
//        myLinkedList.removeNode();
//        //Print the LinkedList in reverse order
//        myLinkedList.reversePrintList();

        LinkedListImpl myLinkedList = new LinkedListImpl();

        //Add elements to the LinkedList
        myLinkedList.add(12);
        myLinkedList.add(15);
        myLinkedList.add(-3);
        myLinkedList.add(0);

        //Print the Linked List
        myLinkedList.printList();

        //Print the Linked List in reverse order
        myLinkedList.reversePrintList();
    }
}
