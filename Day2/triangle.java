package Day2;

public class triangle {
    public static void main(String[] args) {
        int n=6;
        for(int i =1;i<=n;i++){
            //first trian  gle
            for (int k=1;k<=n-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }

            //second triangle
            for(int j=1;j<=i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
