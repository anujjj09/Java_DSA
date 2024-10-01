package Assignment1;

public class Q24 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int k =1;k<=n-i;k++){
                System.out.print("  ");

            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            for(int j=2;j<=i;j++){
                System.out.print(i+ " ");
            }
            System.out.println();


        }
    }
    
}
