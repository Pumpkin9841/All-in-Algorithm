package 代码随想录.数组;

import java.util.Scanner;

/**
 * @author 周凡
 * @date 2021/12/16 0016 下午 22:21
 */
public class lc704_二分查找 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() ;
        int[] nums = new int[n] ;
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt() ;
        }
        System.out.println(new lc704_二分查找().search(nums , 9));
    }

    public int search(int[] nums, int target) {
        int left = 0 ;
        int right = nums.length-1 ;
        while( left <= right ){
            int mid = (left + right) / 2 ;
            if( nums[mid] > target ){
                right = mid - 1 ;
            }
            else if( nums[mid] < target ){
                left = mid + 1 ;
            }
            else{
                return mid ;
            }
        }
        return -1 ;
    }
}
