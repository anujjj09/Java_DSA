package Practice;
public class Q16 {
    public static void main(String[] args) {
        int n = 5;
        
        for (int i = n; i >= 1; i--) {
            // Print spaces to right-align the stars in the inverted right-facing triangle
            for (int k = 1; k <= n - i; k++) {
                System.out.print("    ");  // Four spaces for each decrement in i
            }
            
            // Print stars for the inverted right-facing triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            
            System.out.println(); // Move to the next line for the next row
        }
    }
}
