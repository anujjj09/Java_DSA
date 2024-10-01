package Practice;

import java.util.Scanner;

public class checkprime {
    static boolean checkPrime(int n){
        int i;
        if ( n<2){
            return false;
        }
        for (i=2;i<n ;i++ ){
            if (n%i==0){
                return false;
            }
        }
        return true;
       
    }


    public static void main(String args[]) {
         int n;
         Scanner sc = new Scanner (System.in);
         n = sc.nextInt();
         sc.close();


        if (checkPrime(n)){
            System.out.println(" prime");
            
        }
        else{
            System.out.println("not prime");
        }
        
    
    }
}

    
    

