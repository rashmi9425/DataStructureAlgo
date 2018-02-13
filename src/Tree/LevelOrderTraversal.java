package Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by rashverm on 8/6/2016.
 */
public class LevelOrderTraversal {

    Node root;


    void levelTra(){
        HeightOrDepth height=new HeightOrDepth();

        for(int j=1;j<=height.height(root);j++)
        levelTraversal(root,j);
    }


    void levelTraversal(Node root, int height){
       if(root==null)
           return;

       if(height==1)
           System.out.print(root.value +"-->");
        else if(height>1) {
           levelTraversal(root.left, height - 1);
           levelTraversal(root.right, height - 1);
       }
    }



    void queueTraversal(){

        if(root==null)
            return;
        Queue<Node> q1=new LinkedList<Node>();

        q1.add(root);

        while(!q1.isEmpty()){
            Node temp= q1.poll();

            System.out.print(temp.value+"-->");

            if(temp.left!=null)
                q1.add(temp.left);
            if(temp.right!=null)
                q1.add(temp.right);

        }
    }

        public static void main(String args[])
        {
            LevelOrderTraversal level=new LevelOrderTraversal();


            level.root=new Node(5);
            level.root.left=new Node(6);
            level.root.right=new Node(7);
            level.root.left.left=new Node(8);

            //recursive traversal complexity o(n^2)
            level.levelTra();

            //Using Queue
            System.out.print("\n Using Queue");
            level.queueTraversal();


        }


}
