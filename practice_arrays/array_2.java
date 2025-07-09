package practice_arrays;

public class array_2 {
    static void printArr(int[] arr){
        //for each loop
        for(int i:arr){
            System.out.print(i + " ");
        }

    }


    //create a swap fxn to swap 2 values inside an array
    public static void swap (int [] arr , int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }

    //reverse using swap function
    public static void revUsingSwap(int [] arr){
        for(int i =0,j=arr.length-1 ; j>i ; i++,j--){
            swap(arr, i, j);
        }
        printArr(arr);

    }
    
}
