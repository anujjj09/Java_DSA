package Assignment1;

public class Q17 {
    public static void main(String[] args) {
        int a=7;
        int n=a/2;
        for(int i =n;i>=1;i--){
            for(int j =1;j<=i;j++){
                System.out.print("* ");
            }
            for (int k=1;k<=n-i;k++){
                System.out.print("  ");
            }
            System.out.print("  ");
            for(int k =1;k<=n-i;k++){
                System.out.print("  ");
            }
            for(int j =1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println();

        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print("* ");
            }
            for (int k=1;k<=n-i;k++){
                System.out.print("  ");
            }
            System.out.print("  ");
            for(int k =1;k<=n-i;k++){
                System.out.print("  ");
            }
            for(int j =1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
        
    }
}