package Tree;

/**
 * Created by rashverm on 8/12/2016.
 */
public class ConvertIntoSumTree {
    Node root;
    static int oldValue=0;
    int toSumTree(Node root){

        if(root==null)
            return 0;

        oldValue=root.value;
        root.value=toSumTree(root.left)+toSumTree(root.right);

        return root.value+oldValue;

    }
    public static void main(String args[])
    {
        ConvertIntoSumTree tree = new ConvertIntoSumTree();

        Traversal t1=new Traversal();
        /* Constructing tree given in the above figure */
        tree.root = new Node(10);
        tree.root.left = new Node(-2);
        tree.root.right = new Node(6);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(-4);
        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(5);

        tree.toSumTree(tree.root);

        // Print inorder traversal of the converted tree to test result
        // of toSumTree()
        System.out.println("Inorder Traversal of the resultant tree is:");
        t1.inorder(tree.root);
    }
}
