package 代码随想录.动态规划;

/**
 * @author pumpkin
 * @date 2022/3/8
 */
public class lc1049_最后一块石头的重量Ⅱ {
    class Solution {
        public int lastStoneWeightII(int[] stones) {
            int sum = 0 ;
            for( int i : stones ){
                sum += i ;
            }
            //背包容量为target
            int target = sum / 2 ;
            int[] dp = new int[target+1] ;
            for( int i = 0 ; i < stones.length ; i++ ){
                for( int j = target ; j >= stones[i] ; j-- ){
                    dp[j] = Math.max(dp[j] , dp[j-stones[i]] + stones[i]) ;
                }
            }
            return sum - dp[target] - dp[target] ;
        }
    }
}
