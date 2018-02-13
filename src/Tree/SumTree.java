package Tree;

/**
 * Created by rashverm on 8/10/2016.
 */
public class SumTree {
    Node root;

    int sum(Node root){
        int ls,rs;
        if(root==null)
            return 1;

        if(root.left==null&&root.right==null)
            return 1;

        if(sum(root.left)!=0&&sum(root.right)!=0)
        {


            if(root.left==null)
                ls=0;
            else if(root.left.left==null||root.left.right==null)
                ls=root.left.value;
            else
                ls=2*root.left.value;


            if(root.right==null)
                rs=0;
            else if(root.right.left==null&&root.right.right==null)
                rs=root.right.value;
            else
                rs=2*root.right.value;


            if(root.value==ls+rs)
              return 1;
            else
                return 0;
        }
        return 0;
    }
    public static void main(String[] args) {
        SumTree tree = new SumTree();
        tree.root = new Node(26);
        tree.root.left = new Node(10);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(6);
        tree.root.right.right = new Node(3);

        if(tree.sum(tree.root)!=0)
            System.out.print("Sum Tree");
        else
            System.out.print("Not a Sum Tree");
    }
}
