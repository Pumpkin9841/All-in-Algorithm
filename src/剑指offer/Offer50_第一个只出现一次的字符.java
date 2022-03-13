package 剑指offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pumpkin
 * @date 2022/3/13
 */
public class Offer50_第一个只出现一次的字符 {
    class Solution {
        public char firstUniqChar(String s) {
            Map<Character,Integer> map = new HashMap() ;
            for( int i = 0 ; i < s.length() ; i++ ){
                map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0) + 1 ) ;
            }

            for( int i = 0 ; i < s.length() ; i++ ){
                if( map.get(s.charAt(i)) == 1 ){
                    return s.charAt(i) ;
                }
            }
            return ' ' ;
        }
    }
}
