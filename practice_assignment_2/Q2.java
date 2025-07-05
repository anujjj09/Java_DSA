package practice_assignment_2;
import java.util.*;

// Find the maximum & minimum number in an array of integers. 
// [HINT : Read about Integer.MIN_VALUE & Integer.MAX_VALUE in Java]

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr1 = new int[size];

        for(int i = 0 ; i < arr1.length ; i++ ){
            arr1[i] = sc.nextInt(); 
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i =0; i<arr1.length;i++){
            if (arr1[i] > max){
                max = arr1[i];
            }

            if (arr1[i] < min){
                min = arr1[i];
            }
        }
        sc.close();
        System.out.println("maximum value in array is : " + max);
        System.out.println("minimum value in array is : " + min);
    }
}
