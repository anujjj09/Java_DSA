package Day8;

public class timecomplexity {
    public static void main(String[] args) {
        int n = 100;
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n;j+=i){
                System.out.println("hi");
            }
        }
        // tc - nlogn

        for(int i =1;i<=n;i++){
            for(int j =1 ; j<=i*i;j++){
                for(int k =1;k<=n/2;k++){
                    System.out.println("Hi");
                }
            }
        }

        // tc -  n^4

        



    }
    
}
