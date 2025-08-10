package practice_arrays;

// import java.util.Arrays;

public class array_12 {
    //Q 217 LEETCODE

    // approach 1: check every pair of elements using nested loops.
    // if any element appears more than once, return true
    // time complexity: O(n^2) due to double loop
    // public boolean containsDuplicate(int[] nums) {
    //     for(int i = 0 ; i < nums.length ; i++){
    //         int count = 0;
    //         for(int j = 0 ; j<nums.length ; j++){
    //             if(nums[i] == nums[j]){
    //                 count++;
    //             }
    //             if(count>1) return true;
    //         }
    //     }
    //     return false;
    // }

    //approach 2: used Arrays.sort() to sort elements and compared every element to previous element and if matched, return true
    //time complexity : O(n logn)
    // public boolean containsDuplicate(int[] nums) {
    //     Arrays.sort(nums);
    //     for(int i = 1; i < nums.length ; i++){
    //         if(nums[i] == nums[i-1]){
    //             return true;
    //         }
    //     }
    //     return false;
    // }



    //Q219 CONTAINS DUPLICATE II
    //approach 1 : Brute force — check every pair (i, j) and return true if values match and |i - j| ≤ k.
    // public boolean containsNearbyDuplicate(int[] nums, int k) {
    //     for(int i = 0; i<nums.length ; i++){
    //         for (int j = i+1; j<nums.length ; j++){
    //             if(nums[i] == nums[j] && Math.abs(i-j) <= k){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    //approach 2 : implement after learning HASHSET
    
}
