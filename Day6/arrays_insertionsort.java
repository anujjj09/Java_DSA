package Day6;
import java.util.Arrays;

public class arrays_insertionsort {
    static void printArr(int[] arr){
        //for each loop
        for(int i:arr){
             System.out.print(i + " ");
        }
    }

    static void insertionsort(int arr[]){
        for(int i =1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                --j;
            }
            arr[j+1]=key;
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,6,9,8,7,2,3,5,4};
        //insertionsort(arr);

        Arrays.sort(arr); //sorts array in ascending order
        System.out.println(Arrays.binarySearch(arr, 3));
        printArr(arr);
    }

    
}
