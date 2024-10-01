package Day7;

public class NGERnextgreatestelemtoright {
    //Best Time to Buy and Sell Stock
    static int[] nger(int[] arr){
        int maxelement = 0;
        int[] nger = new int[arr.length];
        for (int i=arr.length-1 ; i>=0 ; i--){
            nger[i] = maxelement;
            maxelement = Math.max(arr[i] , maxelement);
        }
        return nger;
    }
    public static void main(String[] args) {
        int[] n = {7,1,5,3,6,4};
        int[] nger = nger(n);
        for (int i:nger){
            System.out.print(i + " ");
        }
    }

    
}
