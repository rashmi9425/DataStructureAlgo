package Tree;

/**
 * Created by rashverm on 8/13/2016.
 */
public class BoundaryTraversal {
    Node root;

    void printBoundary(Node root) {

        if (root != null) {

            System.out.print(root.value+"->");

            printLeft(root.left);

            printLeaf(root.left);
            printLeaf(root.right);

            printRight(root.right);


        }
    }

    void printLeft(Node root){
        if(root==null)
            return;
        if(root.left!=null)
        {
            System.out.print(root.value+"->");
            printLeft(root.left);
        }
        else if(root.right!=null){
            System.out.print(root.value+"->");
            printLeft(root.right);
        }

    }
    void printRight(Node root){
        if(root==null)
            return;
        if(root.right!=null)
        {
            System.out.print(root.value+"->");
            printLeft(root.right);
        }
        else if(root.left!=null){
            System.out.print(root.value+"->");
            printLeft(root.left);
        }

    }

    void printLeaf(Node root) {
        if (root == null)
            return;

        if (root.left == null && root.right == null) {
           System.out.print(root.value + "->");

        }


        printLeaf(root.left);
        printLeaf(root.right);
    }

    public static void main(String args[]) {
        BoundaryTraversal tree = new BoundaryTraversal();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
      //  tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        tree.root.right = new Node(22);
        tree.root.right.right = new Node(25);
        tree.printBoundary(tree.root);

    }
}
