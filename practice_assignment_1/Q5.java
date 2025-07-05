package practice_assignment_1;
import java.util.*;

// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
public class Q5 {
    public static void eligibility(int x){
        if(x>18){
            System.out.println("eligible");

        }
        else{
            System.out.println("not eligible");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        eligibility(x);
        sc.close();
    }
    
}
