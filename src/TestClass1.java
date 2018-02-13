/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility  classes*/
import java.util.*;


class TestClass1 {

    public static void main(String args[] ) {
        TestClass1 obj=new TestClass1();
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            String s=sc.next();
            int k=sc.nextInt();
            char p=obj.frequency(s,k);
            if(p=='$')
                System.out.println("-1");
            else
                System.out.println(p);
        }

    }

   public Character frequency(String s,int k){
        HashMap<Character,Integer> hm=new HashMap();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                int temp=hm.get(s.charAt(i));
                hm.put(s.charAt(i),temp+1);
            }
            else{
                hm.put(s.charAt(i),1);
            }

        }
        HashMap<Integer,LinkedList<Character>> hm1=new HashMap<>();
       for (Map.Entry<Character,Integer> e:hm.entrySet()) {
           //C h1= hm.values();
         //  h1.
            LinkedList<Character> list = hm1.get(e.getValue());
           if(list==null)
               list = new LinkedList<Character>();
           list.add(e.getKey());
           hm1.put(e.getValue(), list);
       }

       if(hm1.containsKey(k))
           return hm1.get(k).get(0);
       else
           return '$';
    }
}
