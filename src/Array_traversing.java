import java.util.Scanner;

public class Array_traversing {
    int [] arr;
    int [] arr1={1,2,3,4,5};
    Array_traversing(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        arr=new int[n];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
    }

    void Insertion(int index,int data,int lb)throws Exception{
        int ub= arr.length-1;
        for (int i = arr.length-1; i >index; i--) {
            arr[i]=arr[i-1];
        }
        arr[index]=data;

    }


    void Traversing(int lb){
        for (int i = 0; i < arr1.length ; i++) {
            System.out.println(arr1[i]);
        }
    }

    void delete(int index){
        for (int i=index;i> arr1.length;i++){
            arr1[i+1]=arr1[i];
        }
    }


    public static void main(String[] args) throws Exception {
        Array_traversing obj= new Array_traversing();
//        obj.Insertion(2,50,0);
//        obj.delete(2);
        obj.Traversing(0);
    }
}
