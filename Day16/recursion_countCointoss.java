package Day16;

public class recursion_countCointoss {
    static int toss(int n , String ans){
        if(n==0){            
            return n;
        }
        else if(n==1){
            return 2;
        }
        int heads = toss(n-1 , ans + "H");
        int tails = toss(n-1,ans + "T");

        return heads + tails;
    }
    public static void main(String[] args) {
        int n = 3;
        int total = toss(n , "");
        System.out.println(total);

    }
    
}
