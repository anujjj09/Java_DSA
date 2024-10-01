package Day14;
import java.util.ArrayList;
public class Array_List_1 {
    // TIME COMPLEXITY - N
    static ArrayList<Integer> findsubarray(int[] arr,int k){
        int start=0;
        int end=k-1;
        int maxsum=0;
        for(int i=0;i<=end;i++){
            maxsum+=arr[i];
        }
        int currsum=maxsum;
        int index=0;
        while(end < arr.length-1){
            currsum-=arr[start];
            start++;
            end++;
            currsum+=arr[end];
            if(maxsum<currsum){
                index=start;
                maxsum=currsum;
            }
        }
        ArrayList<Integer> nums= new ArrayList<>();
        for(int i=index;i<index+k;i++){
            nums.add(arr[i]);
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] arr={30,30,30,10,20,10,1,40,40};
        ArrayList<Integer> nums= findsubarray(arr, 2);
        System.out.println(nums);
        
    }
}




    //TIME COMPLEXITY - N^2
    //create a function to find the maximum sum subarray of size k
    //[10,20,30,10,20,10,1,40,40] : k = 3
    //return {40,40,1}

    // static ArrayList<Integer> findSubArray(int [] arr , int k){
    //     ArrayList<Integer> list = new ArrayList<>();
    //     int n = arr.length;
    //     int start = 0;
    //     int maxsum = Integer.MIN_VALUE;
    //     for(int i =0;i<=n-k;i++){
    //         int currsum = 0;
    //         for(int j =i;j<i+k;j++){
    //             currsum += arr[j];
    //         }
    //         if(currsum > maxsum){
    //             maxsum = currsum;
    //             start = i;
    //         }
    //     }
    //     for(int i = start;i<start+k;i++){
    //         list.add(arr[i]);
    //     }
    //     return list;

    // }
    // public static void main(String[] args) {
    //     int [] arr = {30,30,30,10,20,10,1,40,40};
    //     int k = 3;

    //     ArrayList <Integer> list = findSubArray(arr, k);
    //     System.out.println(list);



    // }

