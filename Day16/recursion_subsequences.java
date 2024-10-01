package Day16;

public class recursion_subsequences {
    static void subsequence(String P1 , String P2){
        if(P1.length() == 0){
            System.out.println(P2);
            return;
        }
        subsequence(P1.substring(1),P2 + P1.charAt(0));
        subsequence(P1.substring(1), P2);


    }
    public static void main(String[] args) {
        String P1 = "CAR";
        subsequence(P1, "");
        System.out.println(P1); 
    }   
    
}
