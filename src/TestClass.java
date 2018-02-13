/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility  classes*/
import java.util.*;
import java.lang.*;

class TestClass {

    static int value=0;

    public static void main(String args[] ) throws Exception {

        TestClass obj=new TestClass();
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        */
        //Scanner
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();

        for (int i = 0; i < T; i++) {
            int sum=0;
            //System.out.println("hello world");
            int n=s.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=j+1;
                sum=sum+j+1;

            }

            int m=(int)Math.floor(n/2);
             System.out.println("m="+m);
            obj.pandaNumber(arr,n,m,sum);
         /* System.out.println("YES");
          else
          System.out.println("NO");*/

        }


        // System.out.println("Hello World!");
    }

    void pandaNumberUtil(int arr[],int temp[],int start,int end,int index,int m,int sum){
        if (index == m)
        {
            int var=0;
            for (int j=0; j<m; j++){

                var=var+temp[j];
               // System.out.print("temp[j]="+temp[j]+" ");

            }
            System.out.println(var+" ");
            if((sum-2*var)==0){
                value=1;
                return;
            }

            //System.out.println("");
            return ;
        }

        for (int i=start; i<=end && end-i+1 >= m-index; i++)
        {
            temp[index] = arr[i];
              pandaNumberUtil(arr, temp, i+1, end, index+1, m,sum);
        }



    }

    void pandaNumber(int arr[],int n,int m,int sum){
        int temp[]=new int[m];
        pandaNumberUtil(arr,temp,0,n-1,0,m,sum);
           if(value==1)
               System.out.println("Yes");

        else
            System.out.println("No");

    }
}
