package Tree;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by rashverm on 8/7/2016.
 */
public class RootToLeafSumEqualToNumber {
    Node root;
    Boolean sumEqual(Node root, int sum){

         if(root==null)
             return false;

           int diff=sum-root.value;

        if(root.left==null&& root.right==null&& diff==0)
            return true;

           return sumEqual(root.left,diff)||sumEqual(root.right,diff);


    }
    public static void main(String[] args) {
        RootToLeafSumEqualToNumber tree = new RootToLeafSumEqualToNumber();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(2);

        int sum =21;
       if(tree.sumEqual(tree.root,sum))
           System.out.print("sum is present in tree");
        else
           System.out.print("sum is not present in tree");
    }
}
