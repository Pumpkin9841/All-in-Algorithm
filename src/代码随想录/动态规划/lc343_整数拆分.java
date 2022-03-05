package 代码随想录.动态规划;

/**
 * @author pumpkin
 * @date 2022/3/5
 */
public class lc343_整数拆分 {
    class Solution {
        public int integerBreak(int n) {
            //dp[i]为正整数i拆分结果的最大乘积
            int[] dp = new int[n+1];
            dp[2] = 1;
            for (int i = 3; i <= n; ++i) {
                for (int j = 1; j < i - 1; ++j) {
                    //j*(i-j)代表把i拆分为j和i-j两个数相乘
                    //j*dp[i-j]代表把i拆分成j和继续把(i-j)这个数拆分，取(i-j)拆分结果中的最大乘积与j相乘
                    dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
                }
            }
            return dp[n];
        }
    }
}
