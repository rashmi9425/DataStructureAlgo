package Tree;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by rashverm on 8/12/2016.
 */
public class VerticalSum {
    Node root;

    void verticalSumMain(){
        HashMap <Integer,Integer> h1=new HashMap<>();

        verticalSumMainUtil(root,h1,0);


        if(h1!=null)
        {
            System.out.println(h1.entrySet());

        }
    }

    void verticalSumMainUtil(Node root,HashMap h1,Integer l){
        if(root==null)
            return;

        if(h1.containsKey(l)){
            int value =(int)h1.get(l);
            h1.put(l,value+root.value);
        }
        else
            h1.put(l,root.value);

        verticalSumMainUtil(root.left,h1,l-1);
        verticalSumMainUtil(root.right,h1,l+1);
    }

    public static void main(String[] args) {
        /* Create following Binary Tree
              1
            /    \
          2        3
         / \      / \
        4   5    6   7

        */
        VerticalSum tree = new VerticalSum();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
        tree.root.right.left=new Node(6);
        tree.root.right.right=new Node(7);


        System.out.println("Following are the values of vertical sums with "
                + "the positions of the columns with respect to root ");
        tree.verticalSumMain();
    }
}
