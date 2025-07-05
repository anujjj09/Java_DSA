package practice_assignment_1;
import java.util.*;

//Write a function that takes in the radius as input and returns the circumference of a circle.
public class Q4 {
    public static void circumferenceOfCircle(int r){
        double circumference = 2*3.14*r;
        System.out.println("Circumference of circle is : " + circumference);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        circumferenceOfCircle(r);
        sc.close();
    }
}
