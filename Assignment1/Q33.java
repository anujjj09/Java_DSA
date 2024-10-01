package Assignment1;

public class Q33 {
    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=n;i++){
            for(int k =1;k<=n-i;k++){
                System.out.print("  ");
            }
            for(int j =1 ; j<=i; j++){
                if(i==j){
                    System.out.print("0 ");
                }
                else{
                    System.out.print(n-i+j + " ");
                }
            }
            for(int j=1; j<=i-1;j++){
                System.out.print(n-j + " ");

            }
            System.out.println();
        }
    }
    
}
