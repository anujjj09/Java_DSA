package practice_arrays;

public class array_3 {
    static void printArr(int[] arr){
        //for each loop
        for(int i:arr){
            System.out.print(i + " ");
        }

    }

    //linear search in an array
    public static void linearSearch(int [] arr , int x){
        for(int i =0;i<arr.length;i++){
            if(arr[i] == x){
                System.out.println(x + " found at index " + i);
            }
        }
    }

    //binary search in an array
    public static void binarySearch (int [] arr, int x){
        int low = 0;
        int high = arr.length;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] == x){
                System.out.println(i);
            }
            else if (arr[mid]>x){
                low=mid+1;

            }
            else{
                high=mid-1;
                
            }

            low++;
            high--;
        }

    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        linearSearch(arr, 2);
    }
    
}
