package practice_arrays;

public class array_4 {
    //find first index of a reccuring number in a sorted array
    public static int lowerBound(int [] arr, int num){
        int low = 0 , high = arr.length-1 , firstOccurence = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if (arr[mid] == num){
                firstOccurence = mid;
                high = mid - 1;
            }
            else if (arr[mid] > num){
                high = mid - 1;
            }
            else{
                low = mid+1;

            }
        }
        return firstOccurence;
    }


    public static int upperBound(int [] arr , int num){
        int low = 0, high = arr.length-1, lastOccurence = -1;
        while (low<=high){
            int mid = low + (high-low)/2;
            if (arr[mid] == num){
                lastOccurence = mid + 1;
                low = mid+1;

            }
            else if (arr [mid] > num){
                high = mid -1;

            }
            else{
                low = mid+1;

            }
        }
        return lastOccurence;
    }

    public static int countOfOccurence(int [] arr, int num){
        if(lowerBound(arr, num) == -1 || upperBound(arr, num)==-1){
            return 0;
        }
        else{
            return upperBound(arr, num) - lowerBound(arr, num);
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,2,2,3,3,3,4,4,4,5,6,7,7,8};
        int num = 4;

        System.out.println(lowerBound(arr,num));
        System.out.println(upperBound(arr, num));
        System.out.println(countOfOccurence(arr, num));
    }
    
}
