package Day12;
public class TwoDarraylinearsearch {
    static int [] search(int [][] nums,int n){
        int [] ans = new int [2];
        for(int i =0;i<nums.length;i++){
            for(int j =0;j<nums[0].length;j++){
                if (nums[i][j] == n){
                    ans [0]=i;
                    ans [1]=j;
                    return ans;
                }

            }
        }
        return ans;
        
    }

    static void populate(int [][] nums){
        int n = 1;
        for(int i =0;i<nums.length;i++){
            for(int j =0;j<nums[0].length;j++){
                nums[i][j] = n;
                n++;

            }
        }
    }

    public static void main(String[] args) {
        int [][] nums = new int [3][4];
        populate (nums);
        int [] result = search(nums , 7);
        for(int i =0;i<result.length;i++){
            System.out.print((result[i] + " "));
        }


    }
    
}
