package Day8;

public class NGELnextgreateselemtoleft {
    static int [] ngel(int [] arr){
        int[] ngel = new int[arr.length];
        int maxelement=0;
        for (int i=0 ; i<arr.length ; i++){
            ngel[i] = maxelement;
            maxelement = Math.max(arr[i] , maxelement);
        }
        return ngel;
    }

    public static void main(String[] args) {
        int[] n = {3,7,2,5,8,4,9,1,6};
        int[] ngel = ngel(n);
        for (int i:ngel){
            System.out.print(i + " ");
        }
    }
    
}
