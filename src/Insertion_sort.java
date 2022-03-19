public class Insertion_sort {

    public static void insertion_sort(int [] arr){
        for (int i = 1; i < arr.length ; i++) {

            int j=i-1;
            int temp=arr[i];
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }

    public static void main(String[] args) {
        int [] arr={6,4,3,5,2};
        insertion_sort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
