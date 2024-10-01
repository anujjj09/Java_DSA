package Day16;

public class recursion_countSubsequence {
    static int countsubsequence(String P1){
        if(P1.length() == 0){    
            return 0;
        }
        if(P1.length()==1){
            return 2;
        }
        int included = countsubsequence(P1.substring(1));
        int excluded = countsubsequence(P1.substring(1));

        return included + excluded;


    }
    public static void main(String[] args) {
        String P1 = "CAR";
        int total = countsubsequence(P1);
        System.out.println(total); 
    }
    
}
