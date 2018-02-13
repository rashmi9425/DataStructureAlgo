package Tree;

/**
 * Created by rashverm on 8/6/2016.
 */
public class IdenticalTree {
    Node root1,root2;
    boolean identical(){
      return utilIdentical(root1,root2);
    }
    boolean utilIdentical(Node root1,Node root2){
        if(root1==null && root2==null)
            return true;

        if(root1==null || root2==null)
            return false;

      return (root1.value==root2.value &&
              utilIdentical(root1.left,root2.left)
              && utilIdentical(root1.right,root2.right));
    }
    public static void main(String args[])
    {
        IdenticalTree identical=new IdenticalTree();
        identical.root1=new Node(5);
        identical.root1.left=new Node(6);
        identical.root1.right=new Node(7);
        identical.root1.left.left=new Node(6);

        identical.root2=new Node(5);
        identical.root2.left=new Node(6);
        identical.root2.right=new Node(7);
        identical.root2.left.left=new Node(6);

        System.out.print(identical.identical());
    }
}
