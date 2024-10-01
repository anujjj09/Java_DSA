package Day12;

public class TwoDarraysum {
    static void display(int [][] nums){
        for(int i =0;i<nums.length;i++){
            for(int j =0;j<nums[0].length;j++ ){
                System.out.print(nums[i][j] + "\t");
            }
            System.out.println();
        }
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

    static int sum(int [][] nums){
        int sum = 0;
        for(int i =0;i<nums.length;i++){
            for(int j =0;j<nums[0].length;j++){
                sum += nums [i][j];
                

            }
        }
        return sum;

    }
    public static void main(String[] args) {
        int [][] nums = new int [3][4];
        populate(nums);
        int total = sum(nums);
        System.out.println(total);
    }
    
}
