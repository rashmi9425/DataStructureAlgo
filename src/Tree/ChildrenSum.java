package Tree;

/**
 * Created by rashverm on 8/6/2016.
 */
public class ChildrenSum {
    Node root;

    boolean sum(Node root)
    {
      if(root==null || (root.left==null&&root.right==null))
          return true;

        int left=root.left!=null?root.left.value:0;
        int right=root.right!=null?root.right.value:0;


       return root.value==left+right&&sum(root.left)&&sum(root.right);
    }
    public static void main(String[] args) {
        ChildrenSum tree = new ChildrenSum();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(2);

        if(tree.sum(tree.root))
            System.out.print("Sum Tree");
        else
            System.out.print("Not a Sum Tree");
    }

}
