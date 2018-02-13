package String;

/**
 * Created by rashverm on 3/12/2017.
 */
public class PrintConsecutive {
    public static void main(String[] args) {
        String s1="ABCDXYZDCBADFG";

        char ch=s1.charAt(0);
        StringBuilder sb=new StringBuilder();
        sb.append(ch);

        for(int i=1;i<s1.length();++i){
            if((s1.charAt(i)-1)==ch ||s1.charAt(i)+1==ch) {

            }
            else{
                System.out.println(sb);
                sb.setLength(0);

            }
            sb.append(s1.charAt(i));
            ch=s1.charAt(i);

        }
        System.out.println(sb);

    }
}
