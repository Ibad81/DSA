public class Binaray_Search {
    public int Search(int [] arr,int elem){
        int start=0;
        int end=arr.length-1;
        while (start <=end){
            int mid=(start+end)/2;

            if(elem==arr[mid]){
                return mid;
            }
            else if(elem>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;

    }
}
class test{
    public static void main(String[] args) {
        int arr[]={1,20,30,40,56,60,};
        Binaray_Search obj=new Binaray_Search();
        System.out.println(obj.Search(arr,30));
    }
}
