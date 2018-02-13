package Tree;

/**
 * Created by rashverm on 8/6/2016.
 */
public class HeightOrDepth {
    Node root;

    int height(Node root){
        if(root==null)
            return 0;
       int lh=height(root.left);
       int rh=height(root.right);

        return lh>rh?lh+1:rh+1;
    }
    public static void main(String args[])
    {
        HeightOrDepth height=new HeightOrDepth();
        height.root=new Node(5);
        height.root.left=new Node(6);
        height.root.right=new Node(7);
        height.root.left.left=new Node(6);

        System.out.print(height.height(height.root));
    }
}
