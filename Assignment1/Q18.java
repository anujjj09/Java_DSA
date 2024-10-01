package Assignment1;

public class Q18 {
    public static void main(String[] args) {
        int a=7+1;
        int n =a/2;
        for(int i =1; i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print("  ");

            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            

            for(int j=2;j<=i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }

        for(int i =n-1; i>=1;i--){
            for(int k=1;k<=n-i;k++){
                System.out.print("  ");

            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            

            for(int j=2;j<=i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    
        
    }
    
}
