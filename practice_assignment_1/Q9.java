package practice_assignment_1;
import java.util.Scanner;

// Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
public class Q9 {

    // BRUTE FORCE
    // public static int printGCD(int x, int y){
    //     int gcd = 0;
    //     for(int i = 1 ; i<= Math.min(x,y) ; i++){
    //         if (x%i == 0 && y%i == 0){
    //             gcd = i;
    //         }
    //     }
    //     return gcd;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner (System.in);
    //     int x = sc.nextInt();
    //     int y = sc.nextInt();
    //     sc.close();
    //     int value = printGCD(x, y);
    //     System.out.println("GCD of x and y is : " + value);

    // }

    // EUCLIDEAN ALGORITHM
    public static int printGCD(int a , int b){
        while(b!=0){
            int temp = a%b;
            a=b;
            b=temp;
        }
        return a;
    }

    public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            sc.close();
            int value = printGCD(a,b);
            System.out.println("GCD of a and b is : " + value);
        }
}
