package Tree;

/**
 * Created by rashverm on 8/9/2016.
 */
public class PrintAncestors {
    Node root;
    boolean printAncestor(Node root, int value){

        if(root==null)
            return false;

        if(root.value==value)
            return true;

        if(printAncestor(root.left,value)||printAncestor(root.right,value)){
            System.out.print(root.value);
            return true;
        }

        return false;

    }
    public static void main(String[] args) {
        PrintAncestors tree = new PrintAncestors();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.left = new Node(7);

        int value=5;

        tree.printAncestor(tree.root,value);
    }
}
