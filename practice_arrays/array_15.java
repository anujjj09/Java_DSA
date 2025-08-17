package practice_arrays;


public class array_15 {
    // LEETCODE Q875 - KOKO EATING BANANAS
    public static boolean check(int mid , int h, int [] piles){
        long totalHours = 0;
        for(int i = 0; i < piles.length ; i++){
            totalHours += (piles[i] + mid - 1)/mid;
        }
        return totalHours <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1; 
        int high = 0;
        for (int pile : piles) {
            if (pile > high) high = pile; 
        }
        int ans = 1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(check(mid, h, piles)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low=mid+1;
            }

        }
        return ans;  
    }
}    

