package practice_arrays;

public class array_14 {
    //LEETCODE Q1 TWO SUM
    public int[] twoSum(int[] nums, int target) {
        int [] temp = new int [2];
        for(int i = 0; i<nums.length;i++){
            for(int j = i+1; j<nums.length ; j++){
                if(nums[i] + nums[j]  == target){
                    temp [0]= i;
                    temp[1] = j;
                    return temp;
                }
            }
        }
        return new int [0];
    }
    
}
