public class Queue_by_array {
    int [] arr;
    int capacity;
    int rear;
    Queue_by_array(int n){
        capacity=n;
        arr=new int[n];
        rear=-1;
    }
    void enqueue(int data)throws Exception{
        if (rear==capacity-1){
            throw new Exception("Invalid capacity");
        }
        capacity++;
        arr[rear]=data;
    }
    int dequeue(){
        if (rear==-1){
            return 0;
        }
        int res=arr[0];
        for (int i = 0; i <rear ; i++) {
            arr[i]=arr[i+1];
        }
        rear--;
        return arr[0];
    }

    public static void main(String[] args) {

    }
}