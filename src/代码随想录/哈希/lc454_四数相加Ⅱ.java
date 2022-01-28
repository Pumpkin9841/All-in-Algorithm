package 代码随想录.哈希;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pumpkin
 * @date 2022/1/16 0016 下午 14:39
 */
public class lc454_四数相加Ⅱ {
    class Solution {
        public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
            Map<Integer , Integer> map = new HashMap() ;
            for( int a : nums1 ){
                for( int b : nums2 ){
                    map.put( a+b , map.getOrDefault(a+b , 0) + 1 ) ;
                }
            }
            int count = 0 ;
            for( int c : nums3 ){
                for( int d : nums4 ){
                    count += map.getOrDefault(-c-d , 0) ;
                }
            }
            return count ;
        }
    }
}
