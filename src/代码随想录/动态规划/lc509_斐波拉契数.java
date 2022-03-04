package 代码随想录.动态规划;

/**
 * @author pumpkin
 * @date 2022/3/4
 */
public class lc509_斐波拉契数 {
    class Solution {
        public int fib(int n) {
            if( n <= 1 ){
                return n ;
            }
            int[] dp = new int[n+1] ;
            dp[0] = 0 ;
            dp[1] = 1 ;
            for( int i = 2 ; i <= n ; i++ ){
                dp[i] = dp[i-1] + dp[i-2] ;
            }
            return dp[n] ;

        }
    }
}
