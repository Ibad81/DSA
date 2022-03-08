public class CircularQueue_by_array {
    int[] arr;
    int n;
    int front,rear=-1;
    CircularQueue_by_array(int n){
        this.n=n;
        arr=new int[n];
    }
    void enque(int data){
        if((rear+1)%n==front){
            System.out.println("Oueue is full");
        }
        if (front==-1){
            rear=(rear+1)%n;
            arr[rear]=front;
        }

    }
    int dequeue()throws Exception{
        if(front==-1){
            throw new Exception("Queue is full");
        }
        int res=arr[front];
        if(front==rear){
            front=rear=-1;
        }
        else{
            front=(front+1)%n;

        }return res;
    }

    public void traverse()
    {
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {
        CircularQueue_by_array obj=new CircularQueue_by_array(3);
        obj.enque(2);
        obj.enque(3);
        obj.traverse();
    }
}
