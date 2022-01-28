package 代码随想录.哈希;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author pumpkin
 * @date 2022/1/15 0015 下午 17:08
 */
public class lc350_两个数组的交集Ⅱ {
    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            Map<Integer,Integer> map = new HashMap() ;
            for( int i : nums1 ){
                map.put( i , map.getOrDefault(i , 0) + 1 ) ;
            }

            List<Integer> list = new ArrayList() ;
            for( int i : nums2 ){
                if( map.getOrDefault(i , 0) != 0 ){
                    map.put(i , map.get(i)-1) ;
                    list.add(i) ;
                }
            }

            int[] ret = new int[list.size()] ;
            int index = 0 ;
            for( int i : list ){
                ret[index++] = i ;
            }
            return ret ;
        }
    }
}
