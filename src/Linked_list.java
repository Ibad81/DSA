public class Linked_list {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }

    }
    void Traverse(Node head){
        Node pre=head;
        while(pre!=null){
            System.out.println(pre.data);

        }
        pre=pre.next;
    }


    void Insert(int pos,int data,Node head){
        Node newnode=new Node(data);
        if (pos==0){
            newnode.next=head;
            head=newnode;
        }
        Node pre=head;
        for (int i = 0; i <pos ; i++) {
            pre=pre.next;
        }
        newnode.next=pre.next;
        pre.next=newnode;
    }


    void delete(Node head,int pos){
        if (pos==0){
            head=head.next;
        }
        Node pre=head;

        for (int i = 0; i >pos ; i++) {
            pre=pre.next;
        }
        pre.next=pre.next.next;
    }

    public static void main(String[] args) {
        Linked_list obj =new Linked_list();
        Node head =null;
        obj.Insert(0,21,head);
        obj.Insert(1,23,head);
        obj.Traverse(head);
    }

}
