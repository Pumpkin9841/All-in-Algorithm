package 代码随想录.贪心;

/**
 * @author pumpkin
 * @date 2022/2/25
 */
public class lc122_买卖股票的最佳时机 {
    class Solution {
        public int maxProfit(int[] prices) {
            int prefit = 0 ;
            for( int i = 1 ; i < prices.length ; i++ ){
                prefit += Math.max(prices[i] - prices[i-1] , 0) ;
            }
            return prefit ;
        }
    }
}
