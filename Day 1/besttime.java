package hackerrank;

class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int profit=prices[0];
        int maxprofit=0;
        for(int i=1;i<n;i++){
            if(profit<=prices[i]){
                int sum=prices[i]-profit;
                if(sum>maxprofit){
                    maxprofit=sum;
                }
            }
            else{
                profit=prices[i];
            }
        }
        return maxprofit;
        
    }
}