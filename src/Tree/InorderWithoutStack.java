package Tree;

/**
 * Created by rashverm on 8/7/2016.
 */
public class InorderWithoutStack {
Node root;

    void inorder(){
        if(root==null)
            return;
        Node current=root,pre;

        while(current!=null){
            if(current.left==null)
            {
                System.out.print(current.value+"-->");
                current=current.right;
            }
            else{
                pre=current.left;

                while(pre.right!=null&& pre.right!=current)
                    pre=pre.right;

                if(pre.right!=current)
                {
                    pre.right=current;
                    current=current.left;
                }
                else{
                    pre.right=null;
                    System.out.print(current.value+"-->");
                    current=current.right;
                }


            }

        }


    }
    public static void main(String[] args) {
        InorderWithoutStack tree = new InorderWithoutStack();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.inorder();
    }
}
