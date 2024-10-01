package Day10;
public class suffixprefix {
    int[] pSum(int[] arr){
        int[] ans= new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            ans[i+1]=arr[i]+ans[i];
        }
        return ans;
    }

    int[] sSum(int[] arr){
        int[] ans= new int[arr.length+1];
        for(int i=arr.length-1;i>=0;i--){
            ans[i]= arr[i]+ans[i+1];
        }
        return ans;
    }


    //Q1423 leetcode
    public int maxScore(int[] cardPoints, int k) {
        int [] preSum = pSum(cardPoints);
        int [] sufSum = sSum(cardPoints);
        int ans=0;
        int i =k;
        int j = sufSum.length -1;
        while(i>=0){
            if(preSum[i] + sufSum[j] > ans){
                ans = preSum[i]+sufSum[j];
            }
            i--;j--;
        }
        return ans;
        
    }
}
    

