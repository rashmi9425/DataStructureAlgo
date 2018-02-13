package Linklist;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.LinkedList;

/**
 * Created by rashverm on 8/23/2016.
 */

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}


public class GetNthNode {
    Node head;

    int GetNth(int value){
        Node current=head;
        int count=0;
        while(current!=null){
            if(count==value)
                return current.data;

            count++;
            current=current.next;
        }
        return count;
    }

    public void push(int input){
       Node node =new Node(input);
        node.next=head;

        head=node;
    }
    public static void main(String[] args) {
        GetNthNode list =new GetNthNode();
        list.push(1);
        list.push(4);
        list.push(1);
        list.push(12);
        list.push(1);


        System.out.print(list.GetNth(3));
    }
}
