package Day7;

public class rotatearray {
    static void printArr(int[] arr){
        //for each loop
        for(int i:arr){
             System.out.print(i + " ");
        }
    }


    static void rotate(int [] nums, int k){
        for(int i =0;i<k;i++){
            rotateone(nums);
        }
    }
    static void rotateone(int [] nums){
        int temp = nums[nums.length-1];
        for(int i = nums.length-1;i>0;i--){
            nums[i]=nums[i-1];

        }
        nums[0]=temp;

        
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7};
        int k = 2;

        rotate(nums,k);
        printArr(nums);


    }
    
}