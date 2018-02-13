import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EnduranceTest {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer>a=new ArrayList<>();
        for (int i = 0; i < n; i++) {

            String op=sc.next();


            if(op.equals("push")){
                int value=sc.nextInt();
                a.add(value);
                System.out.println(a.get(a.size()-1));
            }
           else if(op.equals("pop")) {
                if(a.isEmpty())
                    System.out.println("Empty");
                else
                {

                    a.remove(a.size()-1);
                    if(!a.isEmpty())
                    System.out.println(a.get(a.size()-1));
                    else
                        System.out.println("Empty");
                }
            }
            else if(op.equals("inc")){
                int index=sc.nextInt();
                 int inc=sc.nextInt();
                System.out.println(index+""+inc);
                for(int j=0;j<index&&j<a.size();j++)
                {
                    int temp= a.get(j);
                    System.out.println("inc"+inc);
                    a.set(j,temp+inc);
                }
                System.out.println(a.get(a.size()-1));
            }
            else
                System.out.println("not a valid operation");
        }


        }

}