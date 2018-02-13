package Tree;

/**
 * Created by rashverm on 8/6/2016.
 */
class Node{
    int value;
    Node left,right;


    Node(int value)
    {
        this.value=value;
        this.left=null;
        this.right=null;
    }


}
public class Traversal {
    Node root;

    void inorder(Node root){
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.value+"-->");
        inorder(root.right);

    }
    void preOrder(Node root){
        if(root==null)
            return;
        System.out.print(root.value+" ");
        inorder(root.left);
        inorder(root.right);

    }
    void postOrder(Node root){
        if(root==null)
            return;

        inorder(root.left);
        inorder(root.right);
        System.out.print(root.value+" ");

    }


    public static void main(String args[])
    {
        Traversal tra=new Traversal();
        tra.root=new Node(5);
        tra.root.left=new Node(6);
        tra.root.right=new Node(7);
        tra.root.left.left=new Node(6);

        //inorder traversal
        System.out.println("Inorder \n");
        tra.inorder(tra.root);
        //preorder traversal
        System.out.println("Preorder \n");
        tra.preOrder(tra.root);
        //postorder traversal
        System.out.println("Posteorder \n");
        tra.postOrder(tra.root);

    }


}

