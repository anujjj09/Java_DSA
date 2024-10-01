package Practice;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int n = sc.nextInt();
            sum += n;
            if (sum < 0) {
                break;
            } else {
                System.out.println(n);
            }
        }
        
        sc.close();
    }
}
