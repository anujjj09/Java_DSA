package Day3;

public class functions {
    //print if the given number is armstrong or not
    static boolean arm(int n){
        int d = digit( n);
        int sum =0;
        int temp =n;
        while(n!=0){
            sum+= Math.pow((n%10),d);
            n/=10;
        }
        return (sum==temp);
    }




    //return number of digits present in a number n
    //if n = 1234 then return 4.
    static int digit(int n){
        int temp =0;
        while (n!=0){
            temp++;
            n/=10;
        }
        return temp;
    }



    //return the inverse of a number n
    //if n = 1546 then return 6451
    static int reverse(int n){
        int temp = 0;

        while(n!=0){
            temp=(temp*10) + n%10;
            n/=10;
        }
        return temp;
        
    }


    //create a function to check if a number is prime or not
    static boolean prime(int n){

        for(int i =2;i<n;i++){
            if (n%i==0){
                return (false);
            }
        
        }    
        return (true);
        
        
    }

    


    //create a function to print first n natural numbers
    static void nnos(int n){
        
        for(int i =1;i<=n;i++){
            System.out.println(i);
        }
        
    }


    //create a function named swap: Swap 2 values;
    /*
     * swap(int a , int b){
     * //code
     * }
     */
    static void swap(int a , int b){
        int c = a;
        
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);
    }

    static void sayHi(String s){
        //code
        System.out.print(s);
    }
    public static void main(String[] args) {
        //int n =371;
        // sayHi("Hello Anuj");
        //swap(5,4);
        //nnos(5);
        
        //System.out.println(prime(n));
        //System.out.println(reverse(n));
        //System.out.println(digit(n));
        //System.out.println(arm(n));
        
    }
    
}
