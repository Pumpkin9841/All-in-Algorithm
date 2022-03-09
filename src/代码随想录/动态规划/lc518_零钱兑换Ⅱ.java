package 代码随想录.动态规划;

/**
 * @author pumpkin
 * @date 2022/3/9
 */
public class lc518_零钱兑换Ⅱ {
    //如果求组合数就是外层for循环遍历物品，内层for遍历背包。
    //
    //如果求排列数就是外层for遍历背包，内层for循环遍历物品
    class Solution {
        public int change(int amount, int[] coins) {
            int[] dp = new int[amount+1] ;
            dp[0] = 1 ;
            for( int i = 0 ; i < coins.length ; i++ ){
                for( int j = coins[i] ; j <= amount ; j++ ){
                    dp[j] += dp[j-coins[i]] ;
                }
            }
            return dp[amount] ;
        }
    }
}
