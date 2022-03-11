package 代码随想录.动态规划;

/**
 * @author pumpkin
 * @date 2022/3/11
 */
public class lc279_完全平方数 {
    class Solution {
        public int numSquares(int n) {
            int[] dp = new int[n+1] ;
            for( int i = 1 ; i <= n ; i++ ){
                dp[i] = Integer.MAX_VALUE ;
            }
            dp[0] = 0 ;
            for( int i = 1 ; i*i <= n ; i++ ){
                for( int j = i*i ; j <= n ;j++ ){
                    if( dp[j-i*i] != Integer.MAX_VALUE ){
                        dp[j] = Math.min(dp[j] , dp[j-i*i]+1) ;
                    }
                }
            }
            return dp[n] ;
        }
    }
}
