package 代码随想录.数组;

/**
 * @author 周凡
 * @date 2021/12/16 0016 下午 22:28
 */
public class lc35_搜索插入位置 {
    public static void main(String[] args) {

    }

    public int searchInsert(int[] nums, int target) {
        int left = 0 ;
        int right = nums.length - 1 ;
        while( left <= right ){
            int mid = ( left + right ) / 2 ;
            if( nums[mid] > target ){
                right = mid - 1 ;
            }
            else if( nums[mid] < target ){
                left = mid + 1 ;
            }
            else {
                return mid ;
            }
        }
        return left ;
    }
}
