public class Stack_by_array {
    int[] arr;
    int capacity;
    int top;
    Stack_by_array(int capacity){
        this.capacity=capacity;
        arr=new int[capacity];
        int top;

    }
    void push(int data){
        if(top==capacity-1){
            System.out.println("Overflow");
        }
        top++;
        arr[top]=data;
    }

    int pop(){
        if (top==-1){
            System.out.println("Under flow");
        }
        int res=arr[top];
        top--;
        return res;
    }
    boolean isEmpty(){
        if (top==-1){
            return true;

        }
        return false;
    }



    int ispeek(){
        if(top==-1){
            return 0;

        }
        return arr[top];
    }

    void print(){
        if (top==-1){
            System.out.println("No varaible");
        }
        else{
            int t=top;
            while(t>-1){
                System.out.println(arr[t]);
                t--;
            }
        }
    }

    public static void main(String[] args) {
        Stack_by_array obj =new Stack_by_array(5);

        System.out.println(obj.isEmpty());
        obj.push(2);
        obj.push(3);
        obj.push(8);
        obj.push(9);
        obj.print();
        obj.pop();
        obj.print();
//        obj.ispeek();


    }
}
