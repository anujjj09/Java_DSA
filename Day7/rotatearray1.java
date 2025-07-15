package Day7;

public class rotatearray1 {
    //leetcode - 189 : rotate an array
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=n;
        int [] temp = new int[nums.length];
        for(int i =0;i<n-k;i++){
            temp[i+k]=nums[i];
        }
        for(int j =0;j<k;j++){
            temp[j]=nums[n-k+j];
        }
        for(int i =0;i<n;i++){
            nums[i]=temp[i];
        }
        


        
    }
    
}
