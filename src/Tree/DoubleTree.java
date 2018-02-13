package Tree;

/**
 * Created by rashverm on 8/8/2016.
 */
public class DoubleTree {
    Node root;

    Node doubleTree(Node root){

        if(root==null)
            return null;
        doubleTree(root.left);
        doubleTree(root.right);

        Node temp=root.left;
        root.left=new Node(root.value);
        root.left.left=temp;
        return root;
    }
    public static void main(String[] args) {
        DoubleTree tree = new DoubleTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        Traversal t1=new Traversal();
        t1.inorder(tree.root);
        System.out.print("\n");
        tree.root=tree.doubleTree(tree.root);


        t1.inorder(tree.root);
    }
}
