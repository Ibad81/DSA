public class Double_linked_list {
    class Node{
        Node next;
        Node previous;
        int data;
//        Node(int data){
//            this.data=data;
//            this.previous=null;
//            this.next=null;
//        }
//
//    }
    Node head=null;
    Node tail=null;
    void Insert(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
            head.next=null;
            tail.next=null;
        }
        tail.next=newnode;
        newnode.next=tail;
        tail=newnode;
        tail.next=null;
    }


    void printall(){
            Node cur = head;
            while (cur!=null) {
                System.out.println(cur.data);
            }
            cur = cur.next;

    }

    public static void main(String[] args) {
        Double_linked_list obj=new Double_linked_list();
        obj.Insert(5);
        obj.Insert(6);
        obj.Insert(63);
        obj.printall();
    }
}

