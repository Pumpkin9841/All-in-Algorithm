package 代码随想录.贪心;

/**
 * @author pumpkin
 * @date 2022/2/25
 */
public class lc53_最大子数组 {
    /**
     * 贪心策略
     * 如果连续子数组总和count为负数了 则就count置为0，从下一个元素重新开始累积
     */
    class Solution {
        public int maxSubArray(int[] nums) {
            if( nums.length == 1 ){
                return nums[0] ;
            }

            int sum = Integer.MIN_VALUE ;
            int count = 0 ;
            for( int i = 0 ; i < nums.length ; i++ ){
                count += nums[i] ;
                sum = Math.max(sum, count) ;
                if( count < 0 ){
                    count = 0 ;
                }
            }
            return sum ;
        }
    }
}
