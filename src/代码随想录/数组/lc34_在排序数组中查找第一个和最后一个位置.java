package 代码随想录.数组;

/**
 * @author 周凡
 * @date 2021/12/16 0016 下午 23:23
 */
public class lc34_在排序数组中查找第一个和最后一个位置 {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {
        if( nums.length == 0 ){
            return new int[]{-1,-1} ;
        }
        int left = 0 ;
        int right = nums.length - 1 ;
        int ans = nums.length ;
        while( left <= right ){
            int mid = ( left + right ) / 2 ;
            if( target <= nums[mid] ){
                ans = mid ;
                right = mid - 1 ;
            }
            else{
                left = mid + 1 ;
            }
        }
        if( ans == nums.length || target != nums[ans]   ){
            return new int[]{-1,-1} ;
        }
        else{
            int first = ans ;
            while( ans < nums.length && nums[ans] == target ){
                ans++;
            }
            return new int[]{first , --ans} ;
        }

    }
}
