package Day6;

public class arrays_selectionsort {
    static void selectionsort(int [] arr){
        for(int i =0;i<arr.length-1;i++){
            int idx = minimumValue(arr,i);
            int temp = arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
        }

        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    static int minimumValue(int [] arr,int a){
        int mini = a;
        for(int i = a+1;i<arr.length;i++){
            if(arr[mini]>arr[i]){
                mini =i;
            }        
        }
        return mini;
    }

    public static void main(String[] args) {
        int [] arr = {8,8,7,6,5,4,9,1,2,2,3,3};
        selectionsort(arr);
    }
    
}
