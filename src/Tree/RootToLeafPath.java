package Tree;

/**
 * Created by rashverm on 8/6/2016.
 */
public class RootToLeafPath {
    Node root;
    void rootPath(){
        int path[]=new int[100];
        int start=0;
        utilPath(root,path,start);
    }

    void utilPath(Node root,int path[],int start){

        if (root==null)
            return;

        path[start++]=root.value;

        if(root.left==null&&root.right==null)
            print(root,path,start);



        utilPath(root.left,path,start);
        utilPath(root.right,path,start);

    }
    void print(Node root,int path[],int start){
        for(int j=0;j<start;j++)
        {
            System.out.print(path[j]+"-->");
        }
        System.out.print("\n");

    }

    public static void main(String args[])
    {
        RootToLeafPath path=new RootToLeafPath();
        path.root=new Node(5);
        path.root.left=new Node(6);
        path.root.right=new Node(7);
        path.root.left.left=new Node(8);

        path.rootPath();
    }
}
