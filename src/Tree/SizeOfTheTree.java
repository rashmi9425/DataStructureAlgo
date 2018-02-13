package Tree;

/**
 * Created by rashverm on 8/6/2016.
 */


public class SizeOfTheTree {
    Node root;

    int size(Node root){
        if(root==null)
            return 0;

       return size(root.left)+size(root.right)+1;

    }
    public static void main(String args[])
    {
        SizeOfTheTree Treesize=new SizeOfTheTree();
        Treesize.root=new Node(5);
        Treesize.root.left=new Node(6);
        Treesize.root.right=new Node(7);
        Treesize.root.left.left=new Node(6);

         System.out.print(Treesize.size(Treesize.root));
    }
}
