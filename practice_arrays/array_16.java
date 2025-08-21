package practice_arrays;

public class array_16 {
    //Q 1991 : Find the Middle Index in Array
    public int [] pSum(int [] arr){
        int [] ans = new int [arr.length +1];
        for(int i = 0 ; i < arr.length ; i++){
            ans[i+1] = arr[i] + ans[i];
        }
        return ans;
    }

    public int [] sSum(int [] arr){
        int [] ans = new int [arr.length+1];
        for(int i = arr.length-1 ; i>=0 ; i--){
            ans[i] = arr[i] + ans[i+1];
        }
        return ans;
    }
    public int findMiddleIndex(int[] nums) {
        int [] prefixSum = pSum(nums);
        int [] suffixSum = sSum(nums);

        for(int i = 0; i < nums.length ; i++){
            if(prefixSum[i] == suffixSum[i+1]){
                return i;
            }

        }
        return -1;
    }
}
