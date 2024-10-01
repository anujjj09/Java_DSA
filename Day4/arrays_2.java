package Day4;

public class arrays_2 {
    static void revusingswap(int [] arr,int a , int b){

        
        for(int i=a, j = b; j>i ; i++,j--){
            swap(arr, i, j);
        }
    }
    


    //create a swap fxn to swap 2 values inside an array
    static void swap (int[] arr, int i , int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr [j]=temp;
    }

    static void printArr(int[] arr){
        //for each loop
        for(int i:arr){
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        //swap(arr,1,3);
        revusingswap(arr,2,3);
        printArr(arr);
    }
    
}
