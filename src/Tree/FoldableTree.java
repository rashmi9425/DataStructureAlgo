package Tree;

/**
 * Created by rashverm on 8/9/2016.
 */
public class FoldableTree {
    Node root;

    boolean isFoldable(Node root1,Node root2){
        if(root1==null&&root2==null)
            return true;
        if(root1==null||root2==null)
            return false;

        return isFoldable(root1.left,root2.right)&&isFoldable(root1.right,root2.left);
    }
    public static void main(String[] args) {
        FoldableTree tree = new FoldableTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.right.right = new Node(4);
        tree.root.left.right = new Node(5);

        if (tree.isFoldable(tree.root,tree.root))
            System.out.println("tree is foldable");
        else
            System.out.println("Tree is not foldable");
    }
}
