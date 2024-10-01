package Day9;

public class BSsearchspace {
    static boolean check(int mid , int dist , int time){
        int a = mid * time;
        if (a >= dist){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        int low =0;
        int high =1000;
        int dist =50;
        int time =2;
        int ans=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(check(mid, dist, time)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }

        }
        System.out.println(ans);

    }
    
}
