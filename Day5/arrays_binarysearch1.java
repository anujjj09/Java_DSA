package Day5;

public class arrays_binarysearch1 {
    static int binarysearch(int arr[], int num){
        int low =0 ,high = arr.length-1;
        int mid = 0;
        while(low<=high){
            mid = (low+high)/2;
            if (arr[mid]== num){
                return mid;
            }
            else if(arr[mid]<num){
                low = mid + 1;
            }
            else if(arr[mid]>num){
                high = mid - 1;
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        int num =6;
        int arr[]={1,2,3,4,5,6};
        System.out.println(binarysearch(arr,num));
    }
    
}
