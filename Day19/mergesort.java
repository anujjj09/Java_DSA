package Day19;

public class mergesort {
    static void merge(int [] arr , int low, int mid, int high){
        int size = high - low+1;
        int [] temp = new int [size];
        int i = mid,j=high,k=size-1;
        while(i>=low && j>=mid+1){
            if(arr[i]>arr[j]){
                temp[k]=arr[i];
                i--;
            }
            else{
                temp[k]=arr[j];
                j--;
            }
            k--;
        }
        while(i>=low){
            temp[k] = arr[i];
            i--;k--;
        }
        while(j>=mid+1){
            temp[k]=arr[j];
            k--;j--;
        }

        //deep copy
        for(i = low;i<= high;i++){
            arr[i]=temp[i-low];
        }
    }


    static void mergeSort(int [] arr,int low , int high){
        if(low<high){
            int mid = (high+low)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }

    }

    public static void main(String[] args) {
        
    }
    
}
