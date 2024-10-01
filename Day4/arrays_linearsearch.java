package Day4;

public class arrays_linearsearch {
    static boolean linearsearch(int [] arr, int n){
        for(int i =0;i<arr.length;i++){
            if (arr[i]==n){
                System.out.println(i);
                return true;
                
                
            }
            
            
        }
        return false;
        
    }



    static void printArr(int[] arr){
        //for each loop
        for(int i:arr){
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(linearsearch(arr, 4));
        
    }

    
}
