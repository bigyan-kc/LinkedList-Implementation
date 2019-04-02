package edu.nsu.collection;

public class LinkedListImpl <E> implements MyList <E>{

    LinkedListNode head;

    public LinkedListImpl(){
        this.head = null;
    }

    public LinkedListImpl(LinkedListNode head){
        this.head = head;
    }

    @Override
    public boolean add(Object o) {
        LinkedListNode newNode = new LinkedListNode(o);
        newNode.next = this.head;
        this.head = newNode;
        return true;
    }

    @Override
    public boolean remove() {
        if(this.head != null){
            LinkedListNode currNode = this.head;
            if(currNode.next == null){
                this.head = null;
                return true;
            }
            while(currNode.next.next !=null){
                currNode = currNode.next;
            }
            currNode.next = null;
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        int size = 0;
        LinkedListNode tempNode = this.head;
        while(tempNode != null){
            ++size;
            tempNode = tempNode.next;
        }
        return size;
    }

    @Override
    public E get(int index) {
        LinkedListNode <E> currNode = this.head;

        int i = 0;
        while(currNode.next != null){
            if(i == index) return currNode.item;
            i++;
        }
        return null;
    }

    @Override
    public E remove(Object o) {
        return null;
    }

    @Override
    public void printList() {
        if(this.head == null) return;
        LinkedListNode temp = this.head;

        while(temp != null){
            System.out.println(temp.item);
            temp = temp.next;
        }
    }

    @Override
    public void reversePrintList() {

        if(this.head == null) return;

        //Printing the Reverse List using recursion
        LinkedListImpl newList = new LinkedListImpl(this.head.next);
        newList.reversePrintList();

        System.out.println(this.head.item);
    }

}
