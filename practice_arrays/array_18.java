package practice_arrays;

public class array_18 {
    public int singleNonDuplicate(int[] nums) {
        int ans = -1;
        if (nums.length == 1){
            return nums[0];
        }
        
        if (nums[0] != nums[1]) return nums[0];

        if (nums[nums.length-1] != nums[nums.length-2]){
            return nums[nums.length-1];
        }

        for(int i = 1 ; i < nums.length-1; i++){
            if (nums[i]!= nums[i-1] && nums[i] != nums[i+1]){
                ans = nums[i];
            }
        }
        return ans;
    }
    
}
