package practice_arrays;

public class array_13 {
    //Binary Search on SearchSpace
    //Find the minimum speed (0–1000 km/h) required to cover 50 km in 2 hours using binary search.    
    public static boolean check(int mid , int time , int dist){
        int a = mid*time;
        if(a>= dist) return true;
        else return false;
    }

    public static int checkIfValid(int [] arr, int time, int dist){
        int low = 0 , high = arr.length-1 , ans = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(check(mid , time, dist )){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] nums = new int [1000];
        for(int i=0;i<nums.length;i++){
            nums[i] = i;
        }

        int time = 2;
        int dist = 50;

        int minSpeed = checkIfValid(nums, time, dist);
        System.out.println("Minimum speed to cover " + dist + " km in " + time + " hours: " + minSpeed + " km/h");
    }
}
