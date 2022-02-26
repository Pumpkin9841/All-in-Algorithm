package 代码随想录.贪心;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pumpkin
 * @date 2022/2/26
 */
public class lc1005_k次取反后最大化的数组和 {
    class Solution {
        public int largestSumAfterKNegations(int[] nums, int k) {
            for( int i = 0 ; i < k ; i++ ){
                Map<String , Integer> map = getMin(nums) ;
                nums[map.get("index")] = nums[map.get("index")]*(-1) ;
            }
            int sum = 0 ;
            for( int i : nums ){
                sum += i ;
            }
            return sum ;
        }

        public Map getMin( int[] nums ){
            Map<String , Integer> map = new HashMap() ;
            int min = Integer.MAX_VALUE ;
            int index = -1 ;
            for( int i = 0 ; i < nums.length ; i++ ){
                if( nums[i] < min ){
                    min = nums[i] ;
                    index = i ;
                }
            }
            map.put("min" , min) ;
            map.put("index" , index) ;
            return map ;
        }
    }
}
