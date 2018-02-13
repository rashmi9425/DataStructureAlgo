package Tree;

/**
 * Created by rashverm on 8/7/2016.
 */

class Node1
{
    char data;
    Node1 left, right;

    Node1(char item)
    {
        data = item;
        left = right = null;
    }
}
public class TreeConstInorderPreorder {
    Node1 root;



   static int preIndex=0;
    Node1 Construct(char[] in, char[] pre, int inStart, int inEnd) {

        if (inStart > inEnd)
            return null;

        Node1 tNode = new Node1(pre[preIndex++]);
        if(inStart==inEnd)
           return tNode;
        int inIndex = Insearch(in,inStart,inEnd, tNode.data);




        tNode.left = Construct(in, pre, inStart, inIndex - 1);
        tNode.right = Construct(in, pre, inIndex + 1, inEnd);
        return tNode;

    }


    int Insearch(char in[],int inStart,int inEnd, char pre) {
        int i;
        for (i = inStart; i < inEnd; i++) {
            if (in[i] == pre)
                break;
        }
        return i;
    }

    void inorder(Node1 root){
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.data+"-->");
        inorder(root.right);
    }

    public static void main(String[] args) {
        TreeConstInorderPreorder tree = new TreeConstInorderPreorder();
        char in[] = new char[]{'D', 'B', 'E', 'A', 'F', 'C'};
        char pre[] = new char[]{'A', 'B', 'D', 'E', 'C', 'F'};
       int len=in.length;
       tree.root= tree.Construct(in, pre,0, len-1);

        tree.inorder(tree.root);
        //Traversal t1=new Traversal();
        //t1.inorder(tree.root);
    }
}
