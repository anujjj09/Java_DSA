package Day3;

public class arrays {
    static void printArr(int[] arr){
        //for each loop
        for(int i:arr){
             System.out.print(i + " ");
         }

        // for(int i =0;i<arr.length;i++){
        //     System.out.print(i + " ");
        // }

    }
    public static void main(String[] args) {
        
        //int[] arr = new int [10];
        // System.out.println(arr);
        // arr[0]=1;
        // System.out.println(arr[0]);

        int [] arr = new int [10];
        // printArr(arr);
        // System.out.println();
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
            printArr(arr);
            System.out.println();
        }
        
    
        
    }
    


    
}
