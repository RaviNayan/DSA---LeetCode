class Solution {
    public int maxProfit(int[] price) {
        int maxProfit = 0;
        int n = price.length;
        int lowprice = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            lowprice = Math.min(lowprice, price[i]);
            maxProfit = Math.max(maxProfit, price[i] - lowprice);
        }
        if (maxProfit > 0)
            return maxProfit;
        else
            return 0;

    }
}