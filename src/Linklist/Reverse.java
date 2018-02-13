package Linklist;

/**
 * Created by rashverm on 8/24/2016.
 */
public class Reverse {
    Node head;

    Node reverse (Node head){
        Node prev=null;
        Node current=head;
        Node next;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;

            current=next;
        }
        head=prev;
        return head;

    }

    void print(){
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }

    Node recursive(Node prev,Node curr){
        if(curr.next==null){
           head=curr;

            curr.next=prev;
            return null;

        }

          Node next=curr.next;
        curr.next=prev;


        recursive(curr,next);

        return head;
    }

    public void push(int input){
        Node node =new Node(input);
        node.next=head;

        head=node;
    }
    public static void main(String[] args) {
        Reverse list =new Reverse();
        list.push(1);
        list.push(4);
        list.push(1);
        list.push(12);
        list.push(1);

        list.print();
        list.head=list.reverse(list.head);
        System.out.print("\n");
        list.print();
        list.head=list.recursive(null,list.head);
        System.out.print("\n");
        list.print();
    }
}
