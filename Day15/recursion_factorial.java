package Day15;

public class recursion_factorial {    
    // HEAD RECURSION
    // static int fact(int n){
    //     if(n==0 || n==1){
    //         return 1;
    //     }
    //     int x = n * fact(n-1);
    //     return x;
    // }


    // TAIL RECURSION
    static int fact(int n , int x){
        if (n==0 || n==1){
            return x;
        }
        return fact(n-1,n*x);
    }


    public static void main(String[] args) {
        int x = 5;
        int result = fact(x,1);
        System.out.println(result);
        
    }
    
}
