package Day15;

public class recursion_multiplication {
    static int multiply(int a , int b){
        if(a==1){
            return b;
        }
        int x = b + multiply(a-1,b);
        return x;
    }

    public static void main(String[] args) {
        int a = 2,b=3;
        int result = multiply(a, b);
        System.out.println(result);
    }
    
}
