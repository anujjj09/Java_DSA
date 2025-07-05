package practice_assignment_1;

import java.util.Scanner;

//Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 ..... 
// In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
// (BONUS)
public class Q10 {
    public static void printFibonacci(int n){
        int a = 0;
        int b = 1;
        int temp = 0;
        // System.out.println(a);
        // System.out.println(b);
        for (int i = 0 ; i<n ; i++){
            System.out.println(a);
            temp = a + b;
            // System.out.println(temp);
            a=b;
            b=temp;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        printFibonacci(n);

    }
}
