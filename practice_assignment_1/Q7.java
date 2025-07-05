package practice_assignment_1;

import java.util.Scanner;

//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
public class Q7 {

    public static int valueOfNumber(int n){
        if (n > 0) return 1;
        else if (n < 0) return -1;
        else return 0;
    }


    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to continue & 0 to stop");
        int input = sc.nextInt();

        while(input==1){    
            int number = sc.nextInt();
            System.out.println(valueOfNumber(number));

            System.out.println("Press 1 to continue & 0 to stop");
            input = sc.nextInt();
        }
        sc.close();
    }
    
}
