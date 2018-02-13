import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


    public static class NodeTrie {

        private HashMap<Character, NodeTrie> children;
        private boolean isCompleteword;
        private char c;

        /**********************************************************************************************************/

        public NodeTrie(char c) {
            super();
            this.children = new HashMap<Character, NodeTrie>();
            this.isCompleteword = false;
            this.c= c;
        }
        public NodeTrie() {
            super();
            this.children = new HashMap<Character, NodeTrie>();
            this.isCompleteword = false;

        }
        /********************************************************************************************************/
        public char getC() {
            return c;
        }
        public void setC(char c) {
            this.c = c;
        }

        public HashMap<Character, NodeTrie> getChildren() {
            return children;
        }

        public void setChildren(HashMap<Character, NodeTrie> children) {
            this.children = children;
        }

        public boolean isCompleteword() {
            return isCompleteword;
        }

        public void setCompleteword(boolean isCompleteword) {
            this.isCompleteword = isCompleteword;
        }

    }
    /*********//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////*********************/
    public static class TrieOperations {

        NodeTrie root;

        /********************************************************************************************************************/
        public TrieOperations() {
            root = new NodeTrie();
        }
        /********************************************************************************************************************/
        public void addWord(String word)
        {
            HashMap<Character, NodeTrie> children = root.getChildren();

            for(int i=0; i<word.length(); i++){
                char c = word.charAt(i);

                NodeTrie t;
                if(children.containsKey(c)){
                    t = children.get(c);
                }else{
                    t = new NodeTrie(c);
                    children.put(c, t);
                }

                children = t.getChildren();

                //set leaf node
                if(i==word.length()-1)
                    t.setCompleteword(true);
            }
        }
        /********************************************************************************************************************/
        public boolean isThereAnyPrefixOf(String word)
        {
            NodeTrie node = root;
            for (int i = 0; i < word.length(); i++)
            {
                Character currentLetter = word.charAt(i);
                if (node.getChildren().containsKey(currentLetter))
                {
                    if (node.isCompleteword() == true) {return true;}

                    node = node.getChildren().get(currentLetter);
                }
                else
                {
                    if (node.isCompleteword() == true) {return true;}
                    else {return false;}
                }
            }
            if (node.isCompleteword() == true) return true;

            else return false;
        }


    }
    /************************************************************/



    /*-*-*-*-*-*-*-*-*-*-*-*---*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*--*--*--*--*-*--*-*--*-*-*--**-*-*-*-*-*/












    public static String firstBadWord(String[] stringSet, int n)
    {
        for(int i =0; i<n;i++)
        {
            TrieOperations trie = new TrieOperations();

            for(int j =0; j<n;j++)
            {
                if (j==i) continue;
                trie.addWord(stringSet[j]);

            }


            if (trie.isThereAnyPrefixOf(stringSet[i])== true) {return stringSet[i];};


        }
        return null;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        String[] stringSet = new String[n];

        for(int i =0; i<n;i++)
        {
            stringSet[i]= scanner.next();
        }


        String res = firstBadWord(stringSet, n);
        if (res != null)
        {
            System.out.println("BAD SET");
            System.out.println(res);

        }

        else
        {
            System.out.println("GOOD SET");

        }
    }
}