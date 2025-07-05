package practice_assignment_1;
import java.util.*;

// Write a function which takes in 2 numbers and returns the greater of those two.
public class Q3 {
    public static void greaterNumber(int x , int y){
        if (x>y){
            System.out.println(x + " is greater than " + y);
        }
        else if (y>x){
            System.out.println(y + " is greater than " + x);
        }
        else{
            System.out.println("Equal");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        greaterNumber(x, y);
    }
    
}
