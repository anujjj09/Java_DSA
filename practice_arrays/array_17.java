package practice_arrays;

public class array_17 {
    // Q1423 : Maximum Points You Can Obtain from Cards
    // approach: Pick i cards from front and k-i cards from back (0 ≤ i ≤ k), maximize their sum.
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
    
    public int maxScore(int[] cardPoints, int k) {
        int[] preSum = pSum(cardPoints);
        int[] suffSum = sSum(cardPoints);

        int ans = 0;
        int i = k;
        int j = suffSum.length-1;

        while(i>=0){
            if(preSum[i] + suffSum[j] > ans){
                ans = preSum[i] + suffSum[j];
                
            }
            i--;j--;
        }
        return ans;
    }
}
