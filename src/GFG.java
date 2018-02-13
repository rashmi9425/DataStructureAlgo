import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

   private static Deque<Integer> dq=new ArrayDeque<>();



    public void leaders(int a[],int n){
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> al=new ArrayList();
        for(int i=n;i>=0;i--){
            if(a[i]>max)
            {
                al.add(a[i]);
                max=a[i];
            }
        }
        Collections.reverse(al);
        al.forEach((p)->System.out.print(p+" "));
    }

    public static void main (String[] args) {
        while(dq.isEmpty()){

        }
        GFG obj=new GFG();
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n=sc.nextInt();

        for(int j=0;j<t;j++){
            int a[]=new int[n];
            for(int k=0;k<n;k++){
                a[k]=sc.nextInt();
            }
            obj.leaders(a,n-1);
            System.out.println("");
        }

    }
}