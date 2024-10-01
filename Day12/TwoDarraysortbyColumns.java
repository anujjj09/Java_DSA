package Day12;
import java.util.*;
public class TwoDarraysortbyColumns {
    static void sortbyColumns(int [][] nums){
        Arrays.sort(nums , (a,b) -> Integer.compare(a[0],b[0]));

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
        sortbyColumns(nums);
        display(nums);

        
    }
    
}
