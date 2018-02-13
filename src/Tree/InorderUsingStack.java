package Tree;

import java.util.Stack;

/**
 * Created by rashverm on 8/7/2016.
 */
public class InorderUsingStack {
    Node root;

    void inorder() {
        if (root == null) {
            return;
        }
        Stack<Node> st = new Stack<>();
        Node node = root;

        while (node != null) {
            st.push(node);
            node = node.left;
        }
        while (!st.isEmpty()) {
            node = st.pop();
            System.out.print(node.value + "-->");

            if (node.right != null) {
                node = node.right;

                while (node != null) {
                    st.push(node);
                    node = node.left;
                }
            }
        }
    }

    public static void main(String[] args) {
        InorderUsingStack tree = new InorderUsingStack();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        Traversal t1 = new Traversal();
        t1.inorder(tree.root);
        tree.inorder();
    }
}
