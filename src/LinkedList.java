/**
 * Class for the Linked List Object
 * 
 * @author Jaineel Nandu
 *
 * @param <T>
 * 
 * @version 20201009
 */
public class LinkedList<T> {

    private LinkedListNode<T> head;
    private LinkedListNode<T> tail;

    /**
     * Constructor for the object
     */
    public LinkedList() {
        head = new LinkedListNode<T>(null);
        tail = head;
    }


    /**
     * Inserts the data node at the back of the Linked List.
     * 
     * @param data
     *            <T> data to be inserted.
     */
    public void insertNode(T data) {
        /*
            Implementation hidden, contact Author
        */
    }


    /**
     * Finds the size of the list.
     * 
     * @return
     *         int size
     */
    public int getListSize() {
        int size = 0;
        /*
            Implementation hidden, contact Author
        */
        return size;
    }


    /**
     * Deletes the node from the linked list.
     * 
     * @param data
     *            <T> data to be deleted.
     */
    public void deleteNode(T data) {
        /*
            Implementation hidden, contact Author
        */
    }


    /**
     * Getter for the head of the Linked List.
     * 
     * @return
     *         LinkedListNode<T> head of the list.
     */
    public LinkedListNode<T> getHead() {
        return head;
    }

}
