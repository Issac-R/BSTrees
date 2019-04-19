/****
 * This class defines the blueprint of a binary tree A binary tree has a root
 * that is a node of type BTNode, a size (the total number of nodes in the tree
 * originated at the root) and a height (the maximum distance between the root
 * and its deepest leaf). Most of the code is given to you. You are asked to
 * complete a few TODOs as shown below. There are 2 TODOs in this file (TODO 4
 * and TODO 5) as well as 1 BONUS.
 ****/

public class BTree<T> {

    private BTNode<T> root;
    private int size;
    private int height;

    // Constructors ****************************************************************
    public BTree() {
    }

    public BTree(BTNode<T> N) {
        root = N;
        size = N.sizeBelow();
        height = N.height();
    }

    // Setters *********************************************************************
    public void setRoot(BTNode<T> N) {
        root = N;
        size = N.sizeBelow();
        height = N.height();
    }

    // Getters
    // **********************************************************************
    public BTNode<T> getRoot() {
        return root;
    }

    public int getSize() {
        return size;
    }

    public int getHeight() {
        return height;
    }

    // Other methods ***************************************************************
    /*
     * In the event that structural changes were made to the tree without updating
     * its size, resetSize() allows to update the size to its current value
     */
    public void resetSize() {
        size = root.sizeBelow();
    }

    /*
     * In the event that structural changes were made to the tree without updating
     * its height, resetHeight() allows to update the size to its current value
     */
    public void resetHeight() {
        height = root.height();
    }

    /*
     * The print method traverses and prints the content of the binary tree in a
     * pre-order fashion (root first, then pre-order of left subtree, then pre-order
     * of right subtree). TODO 4. Complete the implementation of this method. Your
     * implementation of this method must be RECURSIVE.
     */
    public void print() {
        // Your code goes here...
        BTNode<T> copy = root;
        root.printNode();
        if (copy.hasLeft()) {
            BTNode<T> iter = root.getLeft();
            root = iter;
            print();
        }
        if (copy.hasRight()) {
            BTNode<T> iter2 = root.getRight();
            root = iter2;
            print();
        }
        root = copy;
    }

    /*
     * Insert a node in a binary tree, given directions to reach the parent node of
     * the data to insert. We use directions to find where in the tree to "plug" the
     * node TODO 5. Complete the implementation of this method. Example: directions
     * may be "LLRL": The first (n-1) characters (assuming directions has n
     * characters) indicate how to navigate (Left, Right, Father, Mother) from the
     * root to the node after which insertion will occur. The last character of
     * directions indicate whether to insert as left node or right node (or as
     * father line or mother line). Most of the code is given to you below, but look
     * for "TODO 5" for indication of where to complete the code.
     */
    public void insertDataAtLocation(String directions, T data) {
        // if directions = "0", it means that the data to insert will be the root
        if (directions.equals("0")) {
            root = new BTNode<T>(data);
            return;
        }

        // if the data to insert was not the root, we need to traverse the tree so as to
        // find the location where to insert it.
        // We create an iterator, just like we do for singly linked lists
        BTNode<T> iter = root;
        // And now we follow directions:
        for (int j = 0; j < directions.length() - 1; j++) {
            // TODO 5. Your code goes here...
        }
        // Let's build the node to be plugged
        BTNode<T> N = new BTNode<T>(data);
        // Now we "plug" / insert the new node in the proper side (left or right)
        // depending on the last character of directions
        if (directions.charAt(directions.length() - 1) == 'L' || directions.charAt(directions.length() - 1) == 'F') {
            iter.setLeft(N);
        }
        if (directions.charAt(directions.length() - 1) == 'R' || directions.charAt(directions.length() - 1) == 'M') {
            iter.setRight(N);
        }
    }

    /*
     * BONUS: Method inOrderTraversal: This method traverses and prints the content
     * of the binary tree in an in-order fashion: in-order traversal of left
     * subtree, then root, then in-order traversal of right subtree. Complete the
     * implementation of this method. Your implementation of this method must be
     * RECURSIVE.
     */
    public void inOrderTraversal() {
        // BONUS: Your code goes here...
    }
}