package 剑指offer;

import java.util.Arrays;

/**
 * @author pumpkin
 * @date 2022/3/12
 */
public class Offer03_数组中重复的数字 {
    class Solution {
        public int search(int[] nums, int target) {
            int leftIndex = binarySearch( nums , target , true ) ;
            int rightIndex = binarySearch(nums , target , false) - 1;
            if( leftIndex <= rightIndex && rightIndex < nums.length && nums[leftIndex] == target && nums[rightIndex] == target ){
                return rightIndex - leftIndex + 1;
            }
            return 0;
        }

        public int binarySearch( int[] nums , int target , boolean flag ){
            int start = 0 ;
            int end = nums.length - 1 ;
            int ans = nums.length ;
            while( start <= end ){
                int mid = (start + end) / 2 ;
                if( nums[mid] > target || (flag && nums[mid]>= target)  ){
                    end = mid-1 ;
                    ans = mid ;
                }
                else{
                    start = mid + 1  ;
                }
            }
            return ans ;
        }

    }
}
