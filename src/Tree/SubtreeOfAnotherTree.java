package Tree;

/**
 * Created by rashverm on 8/11/2016.
 */
public class SubtreeOfAnotherTree {
    Node root1,root2;

boolean utilIsSubtree(Node root1,Node root2)
{
    if(root1==null&&root2==null)
        return true;
    if(root1==null||root2==null)
        return false;
    return (root1.value==root2.value)&&utilIsSubtree(root1.left,root2.left)&&utilIsSubtree(root1.right,root2.right);

}

    boolean isSubtree(Node root1, Node root2){
        if(root2==null)
            return true;
        if(root1==null)
            return false;

        if(root1.value==root2.value)
            return utilIsSubtree(root1,root2);

            return isSubtree(root1.left,root2)||isSubtree(root1.right,root2);
    }
    public static void main(String args[])
    {
        SubtreeOfAnotherTree tree = new SubtreeOfAnotherTree();

        // TREE 1
        /* Construct the following tree
              26
             /   \
            10     3
           /    \     \
          4      6      3
           \
            30  */

        tree.root1 = new Node(26);
        tree.root1.right = new Node(3);
        tree.root1.right.right = new Node(3);
        tree.root1.left = new Node(10);
        tree.root1.left.left = new Node(4);
        tree.root1.left.left.right = new Node(30);
        tree.root1.left.right = new Node(6);

        // TREE 2
        /* Construct the following tree
           10
         /    \
         4      6
          \
          30  */

        tree.root2 = new Node(10);
        tree.root2.right = new Node(6);
        tree.root2.left = new Node(4);
        tree.root2.left.right = new Node(40);

        if (tree.isSubtree(tree.root1, tree.root2))
            System.out.println("Tree 2 is subtree of Tree 1 ");
        else
            System.out.println("Tree 2 is not a subtree of Tree 1");
    }
}
