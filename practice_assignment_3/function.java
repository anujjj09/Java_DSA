package practice_assignment_3;

public class function {
    //create a function to check if a number is prime or not
    public static boolean checkPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2 ; i<n ; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    
    //return the inverse of a number n
    //if n = 1546 then return 6451
    public static int inverse(int n){
        int temp = 0;
        while(n!=0){
            temp = (temp*10) + n%10;
            n=n/10;
        }
        return temp;

    }

    //return number of digits present in a number n
    //if n = 1234 then return 4.
    public static int digits(int n){
        int dig = 0;
        if(n==0) return 1;
        while(n!=0){
            n=n/10;
            dig++;

        }
        return dig;
    }

    //print if the given number is armstrong or not
    public static boolean checkArmstrong(int n){
        int d = digits(n);
        int num = n;
        int sum = 0;
        while(n!=0){
            sum += Math.pow(n%10 , d);
            n= n/10;
        }

        if(sum!=num){
            return false;
        }
        return true;


    }   


    public static void main(String[] args) {
        int n = 6;
        System.out.println(checkPrime(n));
    }
}
