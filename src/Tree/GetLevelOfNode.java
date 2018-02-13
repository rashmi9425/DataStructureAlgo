package Tree;

/**
 * Created by rashverm on 8/9/2016.
 */
public class GetLevelOfNode {
    Node root;

    int getLevel(Node root,int search,int level){

        if(root==null)
            return 0;
        if(root.value==search)
            return level;

       int lh= getLevel(root.left,search,level+1);
        if(lh!=0)
            return lh;
        int rh=getLevel(root.right,search,level+1);
         return rh ;
    }
    public static void main(String[] args) {
        GetLevelOfNode tree = new GetLevelOfNode();
        tree.root = new Node(3);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(4);

        int value=4;
        System.out.print(tree.getLevel(tree.root,value,1));
    }
}
