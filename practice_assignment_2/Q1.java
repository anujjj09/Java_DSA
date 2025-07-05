package practice_assignment_2;
import java.util.*;

// Take an array of names as input from the user and print them on the screen.

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        String [] names = new String [size];

        for(int i = 0; i<names.length ; i++){
            names[i]=sc.next();
        }

        for(int i = 0; i<names.length ; i++){
            System.out.println(names[i]);
        }

        sc.close();
    }
}
