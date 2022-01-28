package 代码随想录.数组;

/**
 * @author 周凡
 * @date 2021/12/20 0020 下午 23:37
 */
public class lc209_长度最小的子数组 {
    /**
     *  https://programmercarl.com/0209.%E9%95%BF%E5%BA%A6%E6%9C%80%E5%B0%8F%E7%9A%84%E5%AD%90%E6%95%B0%E7%BB%84.html#%E6%9A%B4%E5%8A%9B%E8%A7%A3%E6%B3%95
     * @param target
     * @param nums
     * @return
     */
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0 ;
        int res = Integer.MAX_VALUE ;
        int sum = 0 ;
        for( int right = 0 ; right < nums.length ; right++ ){
            sum += nums[right] ;
            while( sum >= target ){
                res = Math.min( right - left + 1 , res ) ;
                sum -= nums[left++] ;
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
