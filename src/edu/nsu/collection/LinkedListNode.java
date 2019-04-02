package edu.nsu.collection;


public class LinkedListNode <E> {
    E item;
    LinkedListNode next;

    LinkedListNode(E item, LinkedListNode next){
        this.item = item;
        this.next = next;
    }

//    LinkedListNode(){
//
//    }

    LinkedListNode(E e){
        this.item = e;
        this.next = null;
    }

    public E getData(){
        return this.item;
    }

    public LinkedListNode getNext(){
        return this.next;
    }

}
