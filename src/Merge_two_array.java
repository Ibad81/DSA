public class Merge_two_array {
    public static int[] merge_two_array(int[] arr, int[] arr1){

        int i=0;
        int j=0;
        int k=0;
        int []mer=new int[arr.length+ arr1.length];

        while (i<arr.length && j<arr1.length){
            if(arr[i]<arr1[j]){
                mer[k]=arr[i];
                k++;
                i++;
            }else {
                mer[k]=arr1[j];

                k++;
                j++;
            }
        }
        while (i< arr.length){
            mer[k]=arr[i];
            k++;
            i++;
        }
        while(j< arr1.length){
            mer[k]=arr1[j];
            k++;
            j++;
        }
     return mer;
    }

    public static void main(String[] args) {
        int []arr={1,3,5,7};
        int [] arr1={2,4,6};
        int [] mer=merge_two_array(arr,arr1);
        for (int i = 0; i < mer.length ; i++) {
            System.out.println(mer[i]);
        }
    }
}
