package edu.nsu.collection;

/**
 * An ordered collection
 * @author Bigyan K C(b.kc@spartans.nsu.edu)
 */

public interface MyList <E> {


    /**Add an Element to the end of the list
     * @param o the object ot add
     * @return true if the element is added to the list
     */
    boolean add(E o);

    /**Remove an Element from the end of the list
     *
     * @return true if element removed from the list
     */
    boolean remove();

    /**
     * Find the size of the list
     * @return the number of elements in the list
     */
    int size();
    /**
     * Get the element at the given index of the list
     * @param index
     * @return Objet in the given idex
     */
    E get(int index);

    /**
     * Insert the first occurrence of the object from the list
     * @param o
     * @return true if the list contain specified object
     */
    E remove(Object o);

    /**
     * Print the elements of the list
     */
    void printList();

    /**
     *Print the elements of the list in reverse order
     */
    void reversePrintList();
}
