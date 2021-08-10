/**
 * Stub for Node class
 * 
 * @author CS Staff
 * @author Jaineel Nandu
 * 
 * @param <T>
 *            the generic type; extends Comparable
 * @version 20201012
 * 
 */
public class BSTNode<T extends Comparable<T>> {

    private RectangleObj value;
    private BSTNode<T> left;
    private BSTNode<T> right;

    /**
     * Creates an empty object.
     */
    public BSTNode() {
        // Just to create a new empty BSTNode.
    }


    /**
     * Instantiates a new node with a Rectangle Object.
     *
     * @param value
     *            the value
     */
    public BSTNode(RectangleObj value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }


    /**
     * Instantiates a new Node with a T object
     * 
     * @param value2
     *            the value
     */
    public BSTNode(T value2) {
        this.value = (RectangleObj)value2;
        this.left = null;
        this.right = null;
    }


    /**
     * Getter for the value
     * 
     * @return
     *         value
     */
    public RectangleObj value() {
        return value;
    }


    /**
     * Getter for the left Node
     * 
     * @return
     *         left Node
     */
    public BSTNode<T> left() {
        return left;
    }


    /**
     * Getter for the right Node
     * 
     * @return
     *         right Node
     */
    public BSTNode<T> right() {
        return right;
    }


    /**
     * Setter for the value field.
     * 
     * @param newValue
     *            RectangleObj new value to set.
     */
    public void setValue(RectangleObj newValue) {
        value = newValue;
    }


    /**
     * setter for left node
     * 
     * @param newLeft
     *            new left node
     */
    public void setLeft(BSTNode<T> newLeft) {
        left = newLeft;
    }


    /**
     * setter for right node
     * 
     * @param newRight
     *            new right node
     */
    public void setRight(BSTNode<T> newRight) {
        right = newRight;
    }


    /**
     * To check if node is valid to be inserted.
     * 
     * @return
     *         boolean true if node is valid.
     */
    public boolean isValid() {
        return value.isValid();
    }


    /**
     * Compares the node with another
     * 
     * @param checkNode
     *            node to be checked with
     * @return
     *         int -1 if checkNode is larger or same,
     *         0 if strictly same, 1 if
     *         checkNode is smaller
     */
    public int compareTo(BSTNode<T> checkNode) {
        return value.compareTo(checkNode.value());
    }


    /**
     * Checks if the name or the rectangle data match
     * 
     * @param checkNode
     *            node to be checked with
     * @return
     *         true if either the name or the rectangle dimensions match.
     */
    public boolean isNameOrRect(BSTNode<T> checkNode) {
        return value.isNameOrRect(checkNode.value());
    }


    /**
     * To make data in the node as a string.
     */
    @Override
    public String toString() {
        return value.toString();
    }

}
