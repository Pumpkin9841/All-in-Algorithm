package lc周赛.lc_282场周赛_2022_2_27;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pumpkin
 * @date 2022/2/27
 */
public class B_使两字符串互为字母异位词的最小步骤 {
    class Solution {
        public int minSteps(String s, String t) {
            Map<Character,Integer> map_s = new HashMap() ;
            Map<Character,Integer> map_t = new HashMap() ;
            for( int i = 0 ; i < s.length() ; i++ ){
                map_s.put(s.charAt(i) , map_s.getOrDefault(s.charAt(i) , 0)+1 ) ;
            }

            for( int i = 0 ; i < t.length() ; i++ ){
                map_t.put(t.charAt(i) , map_t.getOrDefault(t.charAt(i) , 0)+1 ) ;
            }

            int count = 0 ;
            for( Character c : map_s.keySet() ){
                if( map_t.containsKey(c) ){
                    if( map_t.get(c) < map_s.get(c) ){
                        count += map_s.get(c) - map_t.get(c) ;
                    }
                }
                else{
                    count += map_s.get(c) ;
                }
            }

            for( Character c : map_t.keySet() ){
                if( map_s.containsKey(c) ){
                    if( map_s.get(c) < map_t.get(c) ){
                        count += map_t.get(c) - map_s.get(c) ;
                    }
                }
                else{
                    count += map_t.get(c) ;
                }
            }
            return count ;
        }
    }

}
