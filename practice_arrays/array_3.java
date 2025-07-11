package practice_arrays;

public class array_3 {
    static void printArr(int[] arr){
        //for each loop
        for(int i:arr){
            System.out.print(i + " ");
        }

    }

    //linear search in an array
    public static void linearSearch(int [] arr , int x){
        for(int i =0;i<arr.length;i++){
            if(arr[i] == x){
                System.out.println(x + " found at index " + i);
            }
        }
    }

    //binary search in an array
    public static int binarySearch (int [] arr, int x){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid] == x){
                return mid;
            }
            else if (arr[mid] > x){
                high = mid-1; 
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        linearSearch(arr, 2);
    }
    
}
