class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxprofit = 0;

        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                int pro = prices[j] - prices[i];
                if (pro > 0){
                maxprofit = Math.max(pro, maxprofit);
                }
            }
        }
        return maxprofit;
    }
}
