package 代码随想录.数组;

import java.util.Arrays;

/**
 * @author 周凡
 * @date 2021/12/20 0020 下午 22:36
 */
public class lc977_有序数组的平方 {
    /**
     * 双指针
     * 题解参考代码随想录
     * https://programmercarl.com/0977.%E6%9C%89%E5%BA%8F%E6%95%B0%E7%BB%84%E7%9A%84%E5%B9%B3%E6%96%B9.html#%E6%9A%B4%E5%8A%9B%E6%8E%92%E5%BA%8F
     * @param nums
     * @return
     */
    public int[] sortedSquares(int[] nums) {
        int i = 0 ;
        int j = nums.length-1 ;
        int[] res = new int[nums.length] ;
        int n = nums.length - 1 ;
        while( i <= j ){
            if( nums[i]*nums[i] > nums[j]*nums[j] ){
                res[n--] = nums[i]*nums[i] ;
                i++ ;
            }
            else if( nums[i]*nums[i] <= nums[j]*nums[j] ){
                res[n--] = nums[j]*nums[j] ;
                j-- ;
            }
        }
        return res ;
    }
}
