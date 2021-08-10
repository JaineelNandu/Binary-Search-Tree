/**
 * Stub for binary search tree class
 * 
 * @author Jaineel Nandu
 * @param <T>
 *            the generic type; extends Comparable
 * @version 20201012
 */

public class BST<T extends Comparable<T>> {

    /** The root. */
    protected BSTNode<T> root;

    /** The size. */
    private int size;

    /**
     * Instantiates a new Binary Search Tree.
     */
    public BST() {
        root = null;
        size = 0;
    }


    /**
     * Inserts the new Node in the BST
     * 
     * @param newNode
     *            BSTNode<T> to be inserted.
     */
    public void insert(BSTNode<T> newNode) {
        /*
            Implemntation hidden, contact Author
        */
    }


    /**
     * Checks if the Node already exists in the tree.
     * 
     * @param checkNode
     *            BSTNode<T> to check
     * @param rootNode
     *            BSTNode<T> which is the root Node
     * @return
     *         boolean true if the value is in the tree.
     */
    private boolean isInTree(BSTNode<T> checkNode, BSTNode<T> rootNode) {
        /*
            Implemntation hidden, contact Author
        */
    }


    /**
     * Helper Function to insert the Node in Tree
     * 
     * @param newNode
     *            BSTNode<T> to be inserted.
     * @param rootNode
     *            BSTNode<T> root Node of the Tree.
     * @return
     *         BSTNode<T> root Node after placing the new Node.
     */
    private BSTNode<T> placeInTree(BSTNode<T> newNode, BSTNode<T> rootNode) {
        if (rootNode == null) {
            return newNode;
        }
        else {
            /*
                Implemntation hidden, contact Author
            */
            return rootNode;
        }
    }


    /**
     * Prints the data in the tree.
     */
    public void dump() {
        /*
            Implemntation hidden, contact Author
        */
    }


    /**
     * Helper for the dump function. It uses in-order traversal.
     * 
     * @param rootNode
     *            BSTNode<T> rootNode of the tree.
     * @param depth
     *            int current depth of the tree.
     */
    private void dumpInOrder(BSTNode<T> rootNode, int depth) {
        /*
            Implemntation hidden, contact Author
        */
    }


    /**
     * Generates a LinkedList of the BST with in-order traversal.
     * 
     * @param rootNode
     *            BSTNode<T> root Node of the tree.
     * @param list
     *            LinkedList<T> list of tree nodes in-order, initially put new.
     * @return
     *         LinkedList<T> list of tree nodes in-order.
     */
    @SuppressWarnings("unchecked")
    private LinkedList<T> treeToListInOrder(
        BSTNode<T> rootNode,
        LinkedList<T> list) {
        /*
            Implemntation hidden, contact Author
        */
        return list;
    }


    /**
     * Finds intersecting nodes.
     * 
     * @param searchNode
     *            BSTNode<T> node to find intersections with.
     */
    // @SuppressWarnings("unchecked")
    public void regionSearch(BSTNode<T> searchNode) {
        /*
            Implemntation hidden, contact Author
        */
    }


    /**
     * Helper function to find Intersections, used by both intersection &
     * regionsearch.
     * 
     * @param nodeWith
     *            BSTNode<T> Node to find intersections with.
     * @param treeNodesList
     *            LinkedList<T> of nodes to be searched from.
     * @return
     *         LinkedList<T> of nodes intersecting with nodeWith.
     */
    private LinkedList<T> getIntersectionsList(
        BSTNode<T> nodeWith,
        LinkedList<T> treeNodesList) {
        LinkedList<T> listNodes = new LinkedList<T>();
        /*
            Implemntation hidden, contact Author
        */
        return listNodes;
    }


    /**
     * Helper function to check if two nodes intersect.
     * 
     * @param nodeWith
     *            BSTNode<T> Node to be checked with.
     * @param rootNode
     *            BSTNode<T> root Node of the tree.
     * @return
     *         boolean true if root intersects nodeWith
     */
    private boolean theyIntersect(BSTNode<T> nodeWith, BSTNode<T> rootNode) {
        return nodeWith.value().intersects(rootNode.value());
    }


    /**
     * Function to find all intersecting pairs in the tree.
     */
    public void intersections() {
        /*
            Implemntation hidden, contact Author
        */
    }


    /**
     * Search method, to get information of a certain rectangle by its name.
     * 
     * @param bstNode
     *            Node containing the information of the rectangle to be
     *            searched.
     */
    public void search(BSTNode<T> bstNode) {
        /*
            Implemntation hidden, contact Author
        */
    }


    /**
     * Finds the list of Rectangles that have the same name as search rectangle.
     * 
     * @param mainList
     *            LinkedList<T> of the found rectangles, initially empty.
     * @param bstNode
     *            BSTNode<T> to find
     * @return
     *         LinkedList<T> of found Nodes.
     */
    @SuppressWarnings("unchecked")
    private LinkedList<T> foundRects(
        LinkedList<T> mainList,
        BSTNode<T> bstNode) {
        LinkedList<T> retList = new LinkedList<T>();
        /*
            Implemntation hidden, contact Author
        */
        return retList;
    }


    /**
     * Removes the given BSTNode<T>
     * 
     * @param recObj
     *            BSTNode<T> to be removed.
     */
    public void remove(BSTNode<T> recObj) {
        /*
            Implemntation hidden, contact Author
        */
    }


    /**
     * Finds the size of the list.
     * 
     * @param rootNode
     *            BSTNode<T> root of the tree
     * @param count
     *            int count of the nodes, initially 0.
     * @return
     *         int counts of the nodes.
     */
    private int updateSize(BSTNode<T> rootNode, int count) {
        if (rootNode != null) {
            /*
                Implemntation hidden, contact Author
            */
        }
        return count;
    }


    /**
     * Finds and removes the given node, also replaces it with appropriate node.
     * 
     * @param remNode
     *            BSTNode<T> node to be removed
     * @param rootNode
     *            BSTNode<T> root node
     * @param status
     *            boolean indicates remove status, initially false.
     * @return
     *         boolean true if removed
     */
    private boolean findAndRemove(
        BSTNode<T> remNode,
        BSTNode<T> rootNode,
        boolean status) {
        /*
            Implemntation hidden, contact Author
        */
        return status;

    }


    /**
     * Finds and cuts the leafNode from the tree.
     * 
     * @param leafNode
     *            BSTNode<T> to be cut.
     * @param rootNode
     *            BSTNode<T> root Node of the tree.
     */
    private void cutLeaf(BSTNode<T> leafNode, BSTNode<T> rootNode) {
        /*
            Implemntation hidden, contact Author
        */
    }


    /**
     * Finds the greatest value in the left subtree.
     * 
     * @param rootNode
     *            node from which to begin searching
     * @return
     *         BSTNode<T> of the greatest Node.
     */
    private BSTNode<T> findGreatestInLeft(BSTNode<T> rootNode) {
        BSTNode<T> current = rootNode;
        /*
            Implemntation hidden, contact Author
        */
        return current;
    }

}
