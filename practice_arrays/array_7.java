package practice_arrays;

public class array_7 {
    //rotate an array
    //approach-1
    // static void printArr(int[] arr){
    //     //for each loop
    //     for(int i:arr){
    //          System.out.print(i + " ");
    //     }
    // }

    // public static void rotateone(int [] nums){
    //     int temp = nums[nums.length-1];
    //         for(int i = nums.length-1 ; i>0 ; i--){
    //             nums[i]=nums[i-1];
    //         }
    //         nums[0]=temp;
    // }
    // public static void rotate(int[] nums, int k) {
    //     for(int i = 0; i<k ; i++){
    //         rotateone(nums);
    //     }
    //     printArr(nums);
        
    // }


    // approach - 2
    // public static void rotate(int [] arr, int k){
    //     int n = arr.length;
    //     k%=n;
    //     int [] temp = new int [arr.length];
    //     for(int i = 0; i<n-k;i++){
    //         temp[i+k] = arr[i];
    //     }
    //     for(int j = 0; j<k ; j++){
    //         temp[j] = arr[n-k+j];
    //     }

    //     for(int i =0; i<n;i++){
    //         arr[i] = temp[i];
    //     }
    // }

    // approach - 3 
    // no extra space used 
    public static void reverseArr(int [] arr , int start , int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotate(int [] arr, int k){
        int n = arr.length;
        k%=n;
        reverseArr(arr, 0, n-1);
        reverseArr(arr, 0, k-1);
        reverseArr(arr, k, n-1);
    }


    public static void main(String[] args) {
        
    }
}
