package practice_arrays;

public class array_5 {
    static void printArr(int[] arr){
        //for each loop
        for(int i:arr){
            System.out.print(i + " ");
        }

    }


    //bubblesort
    public static void bubbleSort(int [] arr){
        for(int i =0; i < arr.length-1;i++){
            for(int j = 0 ;j<arr.length-1-i ; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArr(arr);

    }

    //insertion sort
    public static void insertionSort(int [] arr){
        for(int i = 1 ; i<arr.length-1 ; i++){
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;

        }
        printArr(arr);
    }

    //selection sort
    public static void selectionSort(int [] arr){
        for(int i = 0; i<arr.length-1; i++){
            int smallest = i;
            for(int j = i+1 ; j<arr.length; j++){
                if(arr[j] < arr[smallest]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i]  ;
            arr[i]= temp;
        }
        printArr(arr);
    }

    

    public static void main(String[] args) {
        int [] arr ={2,4,5,7,3,1,9,6};
        // bubbleSort(arr);
        // insertionSort(arr);
        selectionSort(arr);
     
        
    }
    
}
