package Day15;

public class recursion_power {
    // HEAD RECURSION
    // static int pow (int a, int b){
    //     if (b==0){
    //         return 1;
    //     }
    //     int x = a * pow(a,b-1);
    //     return x;
    // }


    // TAIL RECURSION
    static int pow(int a, int b, int x) {
        if (b == 0) {
            return x; 
        }
        return pow(a, b - 1, x * a);  
    }
    public static void main(String[] args) {
        int a = 3,b=4;
        int result = pow(a , b , 1);
        System.out.println(result);
    }
    
}
