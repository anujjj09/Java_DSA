package practice_assignment_1;
import java.util.*;

// Write a function to print the sum of all odd numbers from 1 to n.

public class Q2 {
    public static int printSum(int n){
        int sum = 0;
        for(int i = 0; i<=n ; i++){
            
            if(i%2 == 1){
                sum+=i;
            } 
            // else{
            //     return 0;
            // }
            
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int oddSum = printSum(n);
        System.out.println("Sum of odd number is : " + oddSum);

    }
}
