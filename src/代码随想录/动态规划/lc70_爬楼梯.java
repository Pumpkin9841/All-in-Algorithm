package 代码随想录.动态规划;

/**
 * @author pumpkin
 * @date 2022/3/4
 */
public class lc70_爬楼梯 {
    class Solution {
        public int climbStairs(int n) {
            if( n <= 1 ){
                return n ;
            }
            int[] dp = new int[n+1] ;
            dp[1] = 1 ;
            dp[2] = 2 ;
            for( int i = 3 ; i <= n ; i++ ){
                dp[i] = dp[i-1] + dp[i-2] ;
            }
            return dp[n] ;

        }
    }
}
