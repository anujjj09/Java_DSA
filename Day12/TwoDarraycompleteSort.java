package Day12;
import java.util.*;
public class TwoDarraycompleteSort {
    static int [] flaten (int [][] nums){
        int rows = nums.length;
        int col = nums[0].length;
        int [] arr = new int [rows*col];
        for(int i =0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                arr [col*i + j] = nums[i][j];

            }
        }
        return arr;
    }

    static void fillArray(int[][]nums, int []arr){
        int col = nums[0].length;
        for(int i =0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                nums[i][j] = arr [col*i + j];
            }
        }
    }

    static void completeSort(int [][] nums){
        int [] arr = flaten(nums);
        Arrays.sort(arr);
        fillArray(nums,arr);
    }

    static void display(int [][] nums){
        for(int i =0;i<nums.length;i++){
            for(int j =0;j<nums[0].length;j++ ){
                System.out.print(nums[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [][] nums = {
            {1,4,3},
            {8,6,7},
            {2,5,9}
        };
        completeSort(nums);
        display(nums);
        
    }
    
}
