package Day4;

public class arrays_binarysearch {
    static boolean binarysearch(int [] arr , int n){
        int i =0, j= arr.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if (arr[mid]==n){
                return true;
            }
            else if(arr [mid]<n){
                i=mid +1;
            }
            else if(arr[mid]>n) {
                j=mid-1;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};

        System.out.println(binarysearch(arr, 5));
        
    }
    
}
