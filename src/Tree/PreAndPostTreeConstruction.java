package Tree;

/**
 * Created by rashverm on 8/13/2016.
 */
public class PreAndPostTreeConstruction {

    Node root;
    static int preIndex=0;

    Node printInorder(int pre[],int post[],int start,int end){

        if(start>end||preIndex>pre.length-1)
            return null;



        Node root=new Node(pre[preIndex]);
        preIndex++;

        if(start==end)
            return root;

      //  end=searchEnd(root.value,post,start,end);
        int index=0;
if(preIndex<pre.length-1) {
    index = search(post, pre[preIndex], start, end);
    //System.out.print(root.value+" "+index+" "+start+" "+end+" "+"\n");
}
if(index<=end){
    root.left=printInorder(pre,post,start,index);
    root.right=printInorder(pre,post,index+1,end);
}



        return  root;

    }


    int search(int post[],int target,int start,int end){
        int i;
        for(i=start;i<=end;i++){
            if(post[i]==target)
               break;
        }
        return i;
    }
    public static void main(String[] args) {
        PreAndPostTreeConstruction tree = new PreAndPostTreeConstruction();
        int pre[]={1, 2, 4, 8, 9, 5, 3, 6, 7};
        int post[]={8, 9, 4, 5, 2, 6, 7, 3, 1};

        int length=pre.length-1;

        tree.root =tree.printInorder(pre,post,0,length);

        Traversal t1=new Traversal();
        t1.inorder(tree.root);
    }

}
