package Day7;

public class kadanes {

    public static int maxSubArray(int [] nums){
        int maxSum = Integer.MIN_VALUE;
        int currsum=0;
        for(int i =0;i<nums.length;i++){            
            currsum+=nums[i];
            maxSum = Math.max(currsum,maxSum);
            if(currsum<0){
                currsum = 0;
            }        
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));        
    }    
}
