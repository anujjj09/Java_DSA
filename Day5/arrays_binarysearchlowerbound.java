package Day5;

public class arrays_binarysearchlowerbound {
    static int lowerbound(int [] arr, int num){
        int low=0,high=arr.length-1;
        int firstoccurence=-1;
        int mid=0;
        while(low<=high){
            mid =(low+high)/2;
            if(arr[mid]==num){
                firstoccurence = mid;
                high = mid -1;
        
            }
            else if (arr[mid]>num){
                high = mid -1 ;

            }
            else{
                low = mid +1;
            }
        }
        return firstoccurence;
    }

    public static void main(String[] args) {
        int num = 4;
        int [] arr = {1,2,2,3,3,3,4,4,4,5,6,7,7,8};
        System.out.println(lowerbound(arr,num));
    }

    
}
