public class Queue_by_linkedlist {
    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    node front,rear=null;
    void enqueue(int data){
        node newnode=new node(data);
        if (rear==null){
            front=rear=newnode;
        }
        rear.next=newnode;
        rear=newnode;
    }

    int dequeue(){
        if(front == null){
            return 0;
        }
        int res= front.data;
        front=front.next;
        return res;
    }
    void peek() throws Exception {
        if(front==null){
            throw new Exception("Null queue");
        }
        else{
            System.out.println(front.data);
        }
    }

    void print(){
        if (front==null){
            System.out.println("no value");
        }
        while(front!=null){
            System.out.println(front.data);
            front=front.next;
        }
    }

    public static void main(String[] args) {
        Queue_by_linkedlist obj=new Queue_by_linkedlist();
        obj.enqueue(25);
        obj.enqueue(32);
        obj.dequeue();
        obj.print();
    }
}
