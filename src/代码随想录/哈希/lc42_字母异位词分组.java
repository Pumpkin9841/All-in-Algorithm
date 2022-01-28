package 代码随想录.哈希;

import java.util.*;

/**
 * @author pumpkin
 * @date 2022/1/14 0014 下午 15:23
 */
public class lc42_字母异位词分组 {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String , List<String>> map = new HashMap() ;
            for( String s : strs ){
                char[] charS = s.toCharArray() ;
                Arrays.sort(charS) ;
                String key = String.valueOf(charS) ;
                List<String> list = map.getOrDefault(key , new ArrayList()) ;
                list.add(s) ;
                map.put(key , list) ;
            }

            return new ArrayList<List<String>>(map.values()) ;
        }
    }
}
