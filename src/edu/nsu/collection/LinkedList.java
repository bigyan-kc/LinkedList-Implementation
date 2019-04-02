//package edu.nsu.collection;
//
//public class LinkedList {
//
//    LinkedListNode head;
//
//    LinkedList(){
//        this.head = null;
//    }
//
//    LinkedList(LinkedListNode head){
//        this.head = head;
//    }
//
//    //Add Element to the begining of the LinkedList
//    public void addNode(int data){
//
//        LinkedListNode newNode = new LinkedListNode(data);
//
//        if(this.head == null) {
//            this.head = newNode;
//        }
//
//        else{
//            newNode.next = this.head;
//            this.head = newNode;
//        }
//
//    }
//    //Remove the node from the end of the LinkedList
//    public void removeNode(){
//        LinkedListNode curr_node = this.head;
//
//        while(curr_node.next.next !=null){
//            curr_node = curr_node.next;
//        }
//        curr_node.next = null;
//    }
//    //Print the data in LinkedList
//    public void printList(){
//        LinkedListNode temp = this.head;
//
//        while(temp != null){
//            System.out.println(temp.data);
//            temp = temp.next;
//        }
//    }
//
//    //Print LinkedList in Reverse Order
//    public void reversePrintList(){
//
//        if(this.head == null) return;
//
//        //Printing the Reverse List using recursion
//        LinkedList newList = new LinkedList(this.head.next);
//        newList.reversePrintList();
//
//        System.out.println(this.head.data);
//    }
//
//}
