package 代码随想录.哈希;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author pumpkin
 * @date 2022/1/15 0015 下午 16:52
 */
public class lc349_两个数组的交集 {
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Map<Integer,Integer> map1 = new HashMap() ;
            for( int i : nums1 ){
                map1.put( i , map1.getOrDefault(i , 0)+1 ) ;
            }

            Set<Integer> set = new HashSet() ;
            for( int i : nums2 ){
                if( map1.getOrDefault(i , 0) != 0 ){
                    set.add(i) ;
                }
            }
            int[] ret = new int[set.size()] ;
            int index = 0 ;
            for( int i : set ){
                ret[index++] = i ;
            }
            return ret ;
        }
    }
}
