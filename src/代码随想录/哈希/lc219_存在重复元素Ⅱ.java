package 代码随想录.哈希;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author pumpkin
 * @date 2022/1/19 0019 下午 13:14
 */
public class lc219_存在重复元素Ⅱ {
    class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            Map<Integer ,Integer> map = new HashMap() ;
            for( int i : nums ){
                map.put(i , map.getOrDefault(i , 0) + 1) ;
            }
            List<Integer> list = new ArrayList() ;
            for( int i : nums ){
                list.add(i) ;
            }
            Integer second = null ;
            for( int key : nums ){
                System.out.println("key:" + key) ;
                if( map.getOrDefault(key , 0) > 1 ){
                    int first = list.indexOf(key);
                    list.set(first , Integer.MAX_VALUE) ;
                    second = list.indexOf(key) ;
                    //  System.out.println(first + "    " + second) ;
                    System.out.println("second: " + second) ;
                    System.out.println("first: " + first) ;
                    if( Math.abs(second - first) <= k ){
                        return true ;
                    }
                }
            }
            return false ;
        }
    }
}
