class Solution {
    public int maxProfit(int[] prices) {
       // int profit=0; 
        //for(int i = 0;i<prices.length - 1;i++){
          //  for (int j = i+1 ; j<prices.length;j++){
            //    int eq = prices[j]-prices[i];
              //  if(eq > profit){
                //    profit = eq;
                //}
            //}
        //}
        //return profit;
        int min_price=prices[0];
        int profit=0;
        for(int i =1 ; i<prices.length;i++){
            if(prices[i]<min_price){
                min_price = prices[i];
            }
            else if(prices[i] - min_price>profit){
                profit = prices[i] - min_price;
            }
        }
        return profit;
    }
}