package Day2;
import java.util.Scanner;
class PatternPrinting{
    public static void main(String[] args) {

        //Q1. Take an integer n as input and print * n times.
        //5: *****
        //6: ******
        // int n= 10;
        // for(int i =1; i<=n;i++){
        //     System.out.print("*");
        // }





        //print all natural numbers upto 10 starting from i
        //int i;
        //Scanner sc = new Scanner(System.in);
        //i=sc.nextInt();
        //for (int i = sc.nextInt(),j=10;;i<10; i++,j--){
        //    System.out.println(i + " "+ j);
        //}


        //Assignment
        // Q1. n=5
             Scanner sc = new Scanner(System.in);
             int n;
             System.out.print("eneter the number of lines:");
             n=sc.nextInt();
            for (int i=0; i<n; i++){
              for(int j=1; j<=n; j++ ){
                System.out.print("*");
                sc.close();

              }
            System.out.println();           
        }


    }
    
}