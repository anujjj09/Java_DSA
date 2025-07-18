package practice_arrays;

public class array_6 {
    //kadanes algorithm - find max subarray using single for-loop
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;        
        for(int i = 0; i<nums.length;i++){
            currSum += nums[i];
            maxSum = Math.max(maxSum, currSum);
            if(currSum<0){
                currSum=0;
            }
        }
        return maxSum;
    }
}
