package edu.nsu.collection;

public class MainClass {
    public static void main(String []args){

        MyList <String>myLinkedList = new LinkedListImpl<>();

        //Add elements to the LinkedList
        myLinkedList.add("Bigyan");
        myLinkedList.add("loves");
        myLinkedList.add("Samana");
        myLinkedList.add("Bigyan");

        //Print the Linked List
        myLinkedList.printList();

        //Remove an object from List
        myLinkedList.remove("Bigyan");

        //Print the Linked List in reverse order
        myLinkedList.reversePrintList();
    }
}
