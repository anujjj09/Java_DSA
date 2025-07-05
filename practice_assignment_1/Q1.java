package practice_assignment_1;
import java.util.*;

//Enter 3 numbers from the user & make a function to print their average.
public class Q1 {

    public static int printAverage(int x, int y, int z){
        int avg = (x+y+z)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int average = printAverage(x,y,z);
        System.out.println("Average of the given numbers is : " + average);
        sc.close();
        
    }

    
}
