package Day5;

public class arrays_countoccurence {
    static int countoccurence(int [ ] arr, int num){
        int low =0,high=arr.length-1;
        int mid = 0;
        int lowerbound=-1,upperbound=-1;

        //lowerbound
        while (low<=high){
            mid =(low+high)/2;
            if (arr[mid]==num){
                high=mid-1;
                lowerbound = mid;
            }
            else if (arr[mid]>num){
                high = mid -1;
            }
            else{
                low = mid +1;    
            }

        }
        

        low =0 ;
        high = arr.length-1;


        //upperbound
        while(low<=high){
            mid =(low+high)/2;
            if (arr[mid]==num){
                low=mid+1;
                upperbound = mid+1;
            }
            else if (arr[mid]>num){
                high = mid -1;
            }
            else{
                low = mid +1;    
            }

        }
        

        if(lowerbound == -1 || upperbound==-1){
            return 0;
        }
        else{
            return upperbound - lowerbound;
        }
        
        

    }
    
    public static void main(String[] args) {
        int num = 5;
        int [] arr = {1,2,3,4,4,5,5,5,6,6,6,6,7,8};
        System.out.println(countoccurence(arr,num));
    }
}
