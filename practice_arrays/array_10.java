package practice_arrays;

public class array_10 {
    //QUESTION 42 LEETCODE
    public static int [] NGER(int [] height){
        int maxElement = 0;
        int [] right = new int [height.length];
        for(int i = height.length-1 ; i>=0 ; i--){
            right [i] = maxElement;
            maxElement = Math.max(height [i] , maxElement);
        }
        return right;

    }
    public static int [] NGEL(int [] height){
        int maxElement = 0;
        int [] left = new int [height.length];
        for(int i = 0 ; i<height.length ; i++){
            left [i] = maxElement;
            maxElement = Math.max(height [i] , maxElement);
        }
        return left;

    }
    public int trap(int[] height) {
        int[] left = NGEL(height);
        int[] right = NGER(height);

        int ans = 0;
        for(int i = 0; i < height.length ; i++){
            int water = Math.min(left[i],right[i]) - height[i];
            if(water>0){
                ans+=water;
            }
        }
        return ans;
    }
}
