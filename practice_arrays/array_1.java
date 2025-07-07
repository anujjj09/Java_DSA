package practice_arrays;

public class array_1 {
    //print array
    public static void printArr(int [] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    //return sum of arr ; 1,2,3,4,5 then print 15
    public static int sumArr(int arr []){
        int sum = 0;
        for(int i =0; i<arr.length ; i++){
            sum+=arr[i];
        }
        return sum;

    }

    // print an array in reverse order and print 5,4,3,2,1
    public static void printRev(int [] arr){
        for(int i = arr.length-1 ; i>=0;i--){
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        printRev(arr);
    }

    
}
