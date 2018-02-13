package String;

/**
 * Created by rashverm on 2/6/2017.
 */
public class reverse {

    String reverseString(String s1){
        String temp[]=s1.split(" ");

        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }

        return s1;
    }

   /* String utilReverse(){

    }*/
    public static void main(String[] args) {
        String s1=new String("He is the one");
        reverse r1=new reverse();
        r1.reverseString(s1);

    }
}
