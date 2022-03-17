public class Selecton_Sort {

//    arr= 2,6,9,1,5;

    public static void selectionsort(int [] arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            int mid = arr [i];      //2
            int midindex = i;         //0
            for (int j = i + 1; j < arr.length ; j++) {
                if( arr [j] < mid ) {
                                                    //6<2
                                                    //1<2
                    mid = arr[j];             //mid=1
                    midindex=j;              //midindex=3

                }
            }
            arr[midindex] = arr[i];
            arr[i] = mid;
        }
    }

    public static void main(String[] args) {
        int [] arr={2,6,9,1,5};
        selectionsort(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
