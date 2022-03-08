public class Stack_by_linkedlist {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }

    }
    Node head;
    int size;
    Stack_by_linkedlist(){
        head=null;
        size=0;

    }


    void push(int data){
        Node newnode=new Node(data);
        newnode.next=head.next;
        size++;
        head=newnode;
    }
    int pop(){
        if (head==null){
            System.out.println("Oveer fkow");
        }
        int res= head.data;
        head=head.next;
        size--;
        return res;
    }

    boolean isempty(){
        if (head==null){
            return false;
        }
        return true;
    }
    int ispeek(){
        if (size==0){
            return 0;
        }
        return head.data;
    }
}
