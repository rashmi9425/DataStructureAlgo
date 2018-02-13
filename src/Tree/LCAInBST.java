package Tree;

/**
 * Created by rashverm on 8/6/2016.
 */
public class LCAInBST {
    Node root;

    Node lca(Node root,int n1, int n2){

        if(root==null)
          return null;


        if(root.value>n1&&root.value>n2)
          return  lca(root.left,n1,n2);

        if(root.value<n1&&root.value<n2)
          return  lca(root.right,n1,n2);

        return root;
    }
    public static void main(String args[])
    {
        LCAInBST bst=new LCAInBST();
        bst.root=new Node(5);
        bst.root.left=new Node(3);
        bst.root.right=new Node(7);
        bst.root.left.left=new Node(2);

        int n1=2;int n2=7;
        System.out.println(bst.lca(bst.root,n1,n2).value);
    }
}
