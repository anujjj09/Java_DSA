package practice_arrays;

public class array_8 {
    // 121. Best Time to Buy and Sell Stock


    // approach-1
    // n^2 time


    // public int maxProfit(int[] prices) {
    //     int maxPrice = 0;
    //     int currPrice = 0;
    //     for(int i =0;i<prices.length;i++){
    //         for(int j = i+1 ; j<prices.length ; j++){
    //             currPrice = prices[j] - prices[i];
    //             if (currPrice<0){
    //                 currPrice = 0;
    //             }
    //             else if(currPrice > maxPrice){
    //                 maxPrice = currPrice;
    //             }
    //         }
    //     }
    //     return maxPrice;
    // }



    //approach-2
    //find the nger and store it an array then compare arr[i] to nger[i] and store the max diff as max profit
    //n time , n space


    // int [] NGER(int [] arr){
    //     int maxElement = 0;
    //     int [] nger = new int [arr.length];
    //     for(int i = arr.length-1; i>=0 ; i--){
    //         nger[i] = maxElement;
    //         maxElement = Math.max(arr[i], maxElement);
    //     }
    //     return nger;

    // }

    // public int maxProfit(int[] prices) {
    //     int maxElement = 0;
    //     int [] nger = new int [prices.length];
    //     for(int i = prices.length -1 ; i>=0 ; i--){
    //         nger[i] = maxElement;
    //         maxElement = Math.max(prices[i] , maxElement);
    //     }

    //     int maxProfit=0;
    //     for(int i = 0; i<prices.length-1;i++){
    //         maxProfit = Math.max(maxProfit , nger[i] - prices[i]);
    //     }
    //     return maxProfit;
    // }


    // approach-3
    //n time , 1 space
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int currProfit = 0;
        int prevValue = prices[0];
        for(int i = 1; i<prices.length ; i++){
            
            if(prevValue>prices[i]){
                prevValue = prices[i];
            }
            else{
                currProfit = prices[i] - prevValue;
                maxProfit = Math.max(maxProfit , currProfit);
            }
        }
        return maxProfit;
    }
    
}
