package Tree;

/**
 * Created by rashverm on 8/7/2016.
 */

class Height{
      int h;
}
public class Diameter {

    Node root;

    int diameter(Node root,Height h){

        Height lh=new Height();
        Height rh=new Height();
        if(root==null){
            h.h=0;
            return 0;
        }

        lh.h++;
        rh.h++;

        int ld=diameter(root.left,lh);
        int rd=diameter(root.right,rh);
        h.h=Math.max(lh.h,rh.h)+1;
        return Math.max(h.h+1,Math.max(ld,rd));

    }

    public static void main(String[] args) {
        Diameter tree = new Diameter();
        Height h=new Height();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println(tree.diameter(tree.root,h));
    }

}
