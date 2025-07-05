package practice_assignment_2;
import java.util.*;
// Take an array of numbers as input and check if it is an array sorted in ascending order.
// Eg : { 1, 2, 4, 7 } is sorted in ascending order.
// {3, 4, 6, 2} is not sorted in ascending order.

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int [size];

        for(int i =0; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        boolean isAsc = true;


        for(int i=0 ; i<arr.length-1 ; i++){
            if(arr[i] > arr[i+1]){
                isAsc=false;
            }
        }
        
        if (isAsc){
            System.out.println("given array is in ascending order");
        }

        sc.close();
    }
    
}
