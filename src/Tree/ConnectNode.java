package Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by rashverm on 8/11/2016.
 */

class NextNode{
    int value;
    NextNode left,right,nextRight;

    NextNode(int value)
    {
        this.value=value;
        left=right=nextRight=null;
    }

}

public class ConnectNode {
 NextNode root;

    void connect(NextNode root){

        if(root==null)
            return;
        Queue <NextNode> q1=new LinkedList<>();
        root.nextRight=null;
        q1.add(root);
        int size=q1.size();
        while(!q1.isEmpty()){

            size--;

            NextNode temp=q1.remove();

            if(temp.left!=null)
                q1.add(temp.left);

            if(temp.right!=null)
                q1.add(temp.right);

            if(size==0)
            {
                temp.nextRight=null;
                size=q1.size();

            }
            else
             temp.nextRight=q1.peek();


        }

    }

    public static void main(String[] args) {
        ConnectNode tree = new ConnectNode();

        /* Constructed binary tree is
             10
            /  \
          8     2
         /
        3
        */
        tree.root = new NextNode(10);
        tree.root.left = new NextNode(8);
        tree.root.right = new NextNode(2);
        tree.root.left.left = new NextNode(3);

        tree.connect(tree.root);


        System.out.println("Following are populated nextRight pointers in "
                + "the tree" + "(-1 is printed if there is no nextRight)");
        int a = tree.root.nextRight != null ? tree.root.nextRight.value : -1;
        System.out.println("nextRight of " + tree.root.value + " is "
                + a);
        int b = tree.root.left.nextRight != null ?
                tree.root.left.nextRight.value : -1;
        System.out.println("nextRight of " + tree.root.left.value + " is "
                + b);
        int c = tree.root.right.nextRight != null ?
                tree.root.right.nextRight.value : -1;
        System.out.println("nextRight of " + tree.root.right.value + " is "
                + c);
        int d = tree.root.left.left.nextRight != null ?
                tree.root.left.left.nextRight.value : -1;
        System.out.println("nextRight of " + tree.root.left.left.value + " is "
                + d);
    }


}
