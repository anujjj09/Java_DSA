package Day16;

public class recursion_generatevalidparanthesis {
    static void validparanthesis(int n,String ans,int l, int r){
        if (l==n && r==n){
            System.out.println(ans);
            return;
        }
        if(l<n){
            validparanthesis(n, ans + "{", l+1, r);
        }
        if(r<l){
            validparanthesis(n, ans + "}", l, r+1);
        }
    }
    
    public static void main(String[] args) {
        validparanthesis(3, "", 0, 0);
    }
}
