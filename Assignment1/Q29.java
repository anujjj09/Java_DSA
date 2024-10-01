package Assignment1;

public class Q29 {
    public static void main(String[] args) {
        
    
    int n = 5;
    for(int i =1;i<=n;i++){
        for(int k=1;k<=n-i;k++){
            System.out.print("  ");
        }
        for(int j=1;j<=i;j++){
            if(j==1){
                System.out.print(i + " ");
            }
            else{
                System.out.print(0 + " ");
            }
        }
        for(int j=2;j<=i;j++){
            if(j==i){
                System.out.print(i + " ");
            }
            else{
                System.out.print(0 + " ");
            }

        }
        System.out.println();
    }
}
}