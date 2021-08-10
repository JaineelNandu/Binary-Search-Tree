/**
 * Class for the Linked List node object.
 * 
 * @author Jaineel Nandu
 *
 * @param <T>
 *            generic data type
 * 
 * @version 20201009
 */
public class LinkedListNode<T> {
    private T data;
    private LinkedListNode<T> nextNode;

    /**
     * Constructor for the Node
     * 
     * @param data
     *            <T> data
     */
    public LinkedListNode(T data) {
        this.data = data;
        this.nextNode = null;
    }


    /**
     * Getter for the data
     * 
     * @return
     *         <T> data in the node
     */
    public T getData() {
        return this.data;
    }


    /**
     * Getter for the next node
     * 
     * @return
     *         LinkedListNode<T> next node.
     */
    public LinkedListNode<T> getNextNode() {
        return this.nextNode;
    }


    /**
     * setter for the next node.
     * 
     * @param nextNode
     *            LinkedList<T> node to be the next node.
     */
    public void setNextNode(LinkedListNode<T> nextNode) {
        this.nextNode = nextNode;
    }
}
