package practice_assignment_1;

import java.util.Scanner;

//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n.
public class Q8 {
    public static void powerFunction(int x, int n){
        double val = Math.pow(x,n);
        System.out.println(val);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        sc.close();

        powerFunction(x, n);



    }
    
}