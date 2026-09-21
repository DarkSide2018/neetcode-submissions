class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        n = len(prices)
        if n == 1:
            return 0
        
        minPrice = prices[0]
        maxProfit = 0

        for i in range(n):
            if prices[i] <= minPrice:
                minPrice = prices[i]
            else:
                currProfit = prices[i] - minPrice
                if currProfit>maxProfit:
                    maxProfit = currProfit
        
        return maxProfit