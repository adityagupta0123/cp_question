class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int minprofit = prices[0];
        for(int i=0; i<prices.length; i++){
            minprofit = Math.min( minprofit ,prices[i] );
            
            int profit = prices[i] - minprofit;
            
            maxprofit = Math.max( maxprofit , profit );
        }
        // return maxprofit;
//         int n = prices.length;
//         int []left = new int[n];
//         left[0] = prices[0];
//         for(int i=1; i< n; i++){
//                 left[i] = Math.min(left[i-1], prices[i]);
                
//         }
//         int []right = new int [n];
//         right[n -1] = prices[ n-1 ];
//         for( int i = n -2 ; i >= 0; i--){                  // tc-->  O (n)
//             right[i] = Math.max(right[i+1], prices[i]);    // sc --> O(n)
//         }
//         int max = 0;
//         for(int i=0; i< n; i++)
//             max= Math.max(max, right[i] - left[i]);
       
//         return max;
    }
    
}
