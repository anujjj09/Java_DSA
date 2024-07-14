package Day2;
public class rightfacingtri{
public static void main(String[]args){
    int n=5;
    for( int i=1;i<=n;i++){
        for(int k = 1;k <= n-i;k++){
            System.out.print("   ");
        }
        for(int j=i;j<=i;j++){
            System.out.print(" * ");
        }
        for(int j=2;j<=i;j++){
            System.out.print(" * ");
        }
        System.out.println();
    }
}
}

