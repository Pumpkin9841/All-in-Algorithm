package 代码随想录.动态规划;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pumpkin
 * @date 2022/3/11
 */
public class lc377_组合总和Ⅳ {
    class Solution {
        public int combinationSum4(int[] nums, int target) {
            int[] dp = new int[target+1] ;
            dp[0] = 1 ;
            for( int i = 0 ; i <= target ; i++){
                for( int j = 0 ; j < nums.length ; j++ ){
                    if( i >= nums[j] ){
                        dp[i] += dp[i-nums[j]] ;
                    }
                }
            }
            return dp[target] ;
        }

    }
}
