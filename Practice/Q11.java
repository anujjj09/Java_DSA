package Practice;
public class Q11 {
    public static void main(String[] args) {
        int n = 5;
        
        // Loop for each row
        for (int i = 1; i <= n; i++) {
            // Print spaces to right-align the stars in the left-facing triangle
            for (int k = 1; k <= n - i; k++) {
                System.out.print("  ");
            }
            
            // Print stars and spaces for the left-facing triangle
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            
            // Print stars and spaces for the right-facing triangle
            for (int j = 1; j < i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            
            System.out.println(); // Move to the next line for the next row
        }
    }
}
