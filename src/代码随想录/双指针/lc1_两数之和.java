package 代码随想录.双指针;

import java.util.Arrays;

/**
 * @author pumpkin
 * @date 2022/1/15 0015 下午 17:35
 */
public class lc1_两数之和 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] record = new int[nums.length] ;
            int index = 0 ;
            for( int i : nums ){
                record[index++] = i ;
            }
            Arrays.sort(nums) ;
            int left = 0 ;
            int right = nums.length - 1 ;
            int first = 0 ;
            int second = 0 ;
            while( left <= right ){
                if( nums[left] + nums[right] < target ){
                    left ++ ;
                }
                else if( nums[left] + nums[right] > target ){
                    right-- ;
                }
                else if( nums[left] + nums[right] == target ){
                    first = nums[left] ;
                    second = nums[right] ;
                    break ;
                }
            }
            int[] ret = new int[2] ;
            int order = 0 ;
            for( int i = 0 ; i < record.length ; i++ ){
                if( order == 2 ){
                    break ;
                }
                if( record[i] == first || record[i] == second){
                    ret[order++] = i ;
                }
            }
            return ret ;
        }
    }
}
