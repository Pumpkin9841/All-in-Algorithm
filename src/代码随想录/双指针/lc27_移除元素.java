package 代码随想录.双指针;

/**
 * @author pumpkin
 * @date 2022/1/21 0021 下午 14:48
 */
public class lc27_移除元素 {
    class Solution {
        public int removeElement(int[] nums, int val) {
            int left = 0 ;
            for( int right = 0 ; right < nums.length ; right++ ){
                if( nums[right] != val ){
                    nums[left++] = nums[right] ;
                }
            }
            return left ;
        }
    }
}
