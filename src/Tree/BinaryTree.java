package Tree;

/**
 * Created by rashverm on 8/15/2016.
 */
// Java program to print all nodes that don't have sibling

// A binary tree node

class BinaryTree
{
    Node root;

    // Function to print all non-root nodes that don't have a sibling
    void printSingles(Node root)
    {
        // Base case
        if (root == null)
            return;

        if(root.left!=null&&root.right==null)
        {
            System.out.print(root.left.value);
        }
        if(root.left==null&&root.right!=null)
        {
            System.out.print(root.right.value);
        }


       printSingles(root.left);

       printSingles(root.right);
    }
    // Driver program to test the above functions
    public static void main(String args[])
    {
        BinaryTree tree = new BinaryTree();

        /* Let us construct the tree shown in above diagram */

    }
}
