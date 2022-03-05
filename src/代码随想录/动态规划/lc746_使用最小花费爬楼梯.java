package 代码随想录.动态规划;

/**
 * @author pumpkin
 * @date 2022/3/5
 */
public class lc746_使用最小花费爬楼梯 {
    class Solution {
        public int minCostClimbingStairs(int[] cost) {
            if( cost.length == 0 ){
                return 0 ;
            }

            if( cost.length == 1 ){
                return cost[0] ;
            }

            int[] dp = new int[cost.length] ;
            dp[0] = cost[0] ;
            dp[1] = cost[1] ;
            for( int i = 2 ; i < cost.length ; i++ ){
                dp[i] = Math.min(dp[i-1] , dp[i-2]) + cost[i] ;
            }

            //最后一步不需要花费
            return Math.min(dp[cost.length-1] , dp[cost.length-2]) ;

        }
    }
}
