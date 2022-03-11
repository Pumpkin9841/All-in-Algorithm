package 代码随想录.动态规划;

/**
 * @author pumpkin
 * @date 2022/3/11
 */
public class lc322_零钱兑换 {
    class Solution {
        public int coinChange(int[] coins, int amount) {
            int[] dp = new int[amount+1] ;
            for( int i = 1 ; i <= amount ; i++){
                dp[i] = Integer.MAX_VALUE ;
            }
            dp[0] = 0 ;
            for( int i = 0 ; i < coins.length ; i++ ){
                for( int j = coins[i] ; j <= amount ; j++ ){
                    if( dp[j-coins[i]] != Integer.MAX_VALUE ){
                        dp[j] = Math.min(dp[j] , dp[j-coins[i]]+1) ;
                    }
                }
            }
            return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount] ;
        }
    }
}
