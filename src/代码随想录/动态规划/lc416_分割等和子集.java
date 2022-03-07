package 代码随想录.动态规划;

/**
 * @author pumpkin
 * @date 2022/3/7
 */
public class lc416_分割等和子集 {
    class Solution {
        public boolean canPartition(int[] nums) {
            if( nums.length == 1 ){
                return false ;
            }

            int sum = 0 ;
            for( int num : nums ){
                sum += num ;
            }
            if( sum % 2 != 0 ){
                return false ;
            }
            int target = sum / 2 ;
            //转化为01背包问题
            int[] dp = new int[target+1] ;

            for( int i = 0 ; i < nums.length ; i++ ){
                for( int j = target ; j >= nums[i] ; j-- ){
                    dp[j] = Math.max(dp[j] , dp[j-nums[i]]+nums[i]);
                }
            }
            return dp[target] == target ;
        }
    }
}
