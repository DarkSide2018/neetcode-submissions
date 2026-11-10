class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1) return 0;

        int minimum = prices[0];
        int maximum = prices[0];

        int currDiff = 0;

        int maxCurrDiff = 0;

        for(int i=1;i<prices.length; i++){

            if(prices[i]>minimum){

                maximum = prices[i];

                currDiff = maximum - minimum;
                maxCurrDiff = Math.max(maxCurrDiff,currDiff);
                continue;
            }
            
            minimum = Math.min(minimum,prices[i]);
        }

        return maxCurrDiff;
    }
}
