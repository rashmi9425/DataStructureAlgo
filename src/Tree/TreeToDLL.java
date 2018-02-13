package Tree;

/**
 * Created by rashverm on 8/14/2016.
 */
public class TreeToDLL {
    Node root;
    static Node head=null;

    void dll(Node root){

        if(root==null)
            return;
        dll( root.right);


            if(head==null){
                head=root;

            }
            else{
                root.right=head;
                head.left=root;

            }

        head=root;
        dll( root.left);


    }
void printList(Node node){
    while (node != null)
    {
        System.out.print(node.value + " ");
        node = node.right;
    }
}
    public static void main(String[] args) {
        TreeToDLL tree= new TreeToDLL();
        tree.root=new Node(10);
        tree.root.left=new Node(12);
        tree.root.left.left=new Node(25);
        tree.root.left.right=new Node(30);
        tree.root.right=new Node(15);
        tree.root.right.left=new Node(36);



        tree.dll(tree.root);

        tree.printList(tree.head);

    }
}
