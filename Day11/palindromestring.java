package Day11;
public class palindromestring {
    //Q2. palindrome or not
    static boolean palindrome(String s){
        int i =0,j = s.length()-1;
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
            
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anna";
        System.out.println(palindrome(s));
        
    }
    
}
