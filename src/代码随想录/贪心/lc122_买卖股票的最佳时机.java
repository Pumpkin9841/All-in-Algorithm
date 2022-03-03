package 代码随想录.贪心;

/**
 * @author pumpkin
 * @date 2022/2/25
 */
public class lc122_买卖股票的最佳时机 {
    // 贪心思路
    class Solution {
        public int maxProfit(int[] prices, int fee) {
            int buy = prices[0] + fee;
            int sum = 0;
            for (int p : prices) {
                if (p + fee < buy) {
                    buy = p + fee;
                } else if (p > buy){
                    sum += p - buy;
                    buy = p;
                }
            }
            return sum;
        }
    }
}
