package Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by rashverm on 8/8/2016.
 */
public class MaxWidthTree {

    Node root;
    int maxWidth(){

        if(root==null)
            return 0;
        Queue<Node> q1=new LinkedList<>();
        q1.add(root);

        int size=q1.size();
        int max=size;
        while (!q1.isEmpty())
        {

            Node output= q1.poll();

            if(output.left!=null)
                q1.add(output.left);
            if(output.right!=null)
                q1.add(output.right);

            size--;
            if(size==0){
                size=q1.size();
                if(size>max)
                    max=size;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        MaxWidthTree tree = new MaxWidthTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(8);
        tree.root.right.right.left = new Node(6);
        tree.root.right.right.right = new Node(7);

        System.out.print(tree.maxWidth());


    }
}
