package 代码随想录.双指针;

/**
 * @author pumpkin
 * @date 2022/1/21 0021 下午 14:53
 */
public class lc283_移动零 {
    class Solution {
        public void moveZeroes(int[] nums) {
            int left = 0 ;
            //按顺序将后面不为0的元素一个一个往前面挪
            for( int right = 0 ; right < nums.length ; right++ ){
                if( nums[right] != 0 ){
                    int temp = nums[left] ;
                    nums[left++] = nums[right] ;
                    nums[right] = temp ;
                }
            }
        }
    }

    public static void main(String[] args) {
        String s = "Dasdas" ;

    }

}
