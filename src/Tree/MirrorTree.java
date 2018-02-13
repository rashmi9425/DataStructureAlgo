package Tree;

/**
 * Created by rashverm on 8/6/2016.
 */
public class MirrorTree {
    Node root;

    Node mirror(Node root){
        if(root==null)
            return root;

        Node left= mirror(root.left);
        Node right=mirror(root.right);

        root.left=right;
        root.right=left;

        return root;
    }


    public static void main(String args[])
    {
        MirrorTree m1=new MirrorTree();
        Traversal t1=new Traversal();

        m1.root=new Node(5);
        m1.root.left=new Node(6);
        m1.root.right=new Node(7);
        m1.root.left.left=new Node(8);

        t1.inorder(m1.root);
        m1.root=m1.mirror(m1.root);
        System.out.println("\nMirror image");
        t1.inorder(m1.root);
    }
}
