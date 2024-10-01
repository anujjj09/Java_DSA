package Day3;

public class arrays_1 {
    // reverse the array 
    static void reverse (int [] arr){
        int[] temp = new int [arr.length];
        for(int i =0;i<arr.length;i++){

            temp[i]=arr[arr.length-i-1];
        }
        
        //arr=temp;

        //deep copy
        for(int i =0;i<arr.length;i++){
            arr[i]=temp[i];
        }

        

    }



    // print an array in reverse order and print 5,4,3,2,1
    static void printRev(int[] arr){
        for(int i =arr.length-1;i>=0;i--){
            System.out.print(arr[i]+ " ");
        }
        
    }




    //return sum of arr ; 1,2,3,4,5 then print 15
    static int sumArr(int[] arr, int a ,int b){
        int sum =0;
        //for each loop (can not access index)
        // for (int i : arr){
        //     sum+= i;
        // }

        if(a>b || a<0 || b<0 || b>=arr.length){
            return 0;
        }


        for(int i=a;i<=b;i++){
            sum+= arr[i];
        }
        return sum;
    }


    static void printArr(int[] arr){
        //for each loop
        for(int i:arr){
            System.out.print(i + " ");
        }

    }

    
    
    
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        // System.out.println(sumArr(arr, 2,4));
        // printRev(arr);
        
        // reverse(arr);
        // printArr(arr);

        System.out.print(sumArr(arr, 0, 4));

        


        
        


        
        

        




        
        
    }
    
}
