package Day2;

public class invertedlefttri {
  
    public static void main(String[]args){
        int n=7;
        for( int i=1;i<n;i++){
            for (int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}  

