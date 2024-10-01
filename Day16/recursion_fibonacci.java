package Day16;

public class recursion_fibonacci {
    static int fib (int x){
        if(x==0 || x==1){
            return x;
        }
        return fib(x-1) + fib(x-2);

    }
    public static void main(String[] args) {
        int result = fib(3);
        System.out.println(result);

    }
}
    