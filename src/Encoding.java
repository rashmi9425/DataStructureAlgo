/*
import java.util.LinkedList;
import java.util.Queue;

*/
/**
 * Created by rashverm on 9/25/2016.
 *//*

public class Encoding {
    String encode(String str) {
        StringBuilder stBuild = new StringBuilder();
        int count = 1;
        Character a = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (a == str.charAt(i)) {
                count++;

            } else {
                stBuild.append(a);
                stBuild.append(count);
                count = 1;
            }
            a = str.charAt(i);
        }
        if (count != 0) {
            stBuild.append(a);
            stBuild.append(count);
        }
        //Your code here

        System.out.print(stBuild + " " + str.length());
        //  return stBuild.toString();

    }


    //}
    public static void main(String[] args) {
        Encoding e1=new Encoding();
        String str="aaaabbbccc";
        e1.encode(str);
    }
}
*/
