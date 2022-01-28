package 代码随想录.哈希;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pumpkin
 * @date 2022/1/14 0014 下午 14:44
 */
public class lc242_有效的字母异位词 {
    class Solution {
        public boolean isAnagram(String s, String t) {
            if( s.length() != t.length() ){
                return false ;
            }

            Map<Character , Integer> mapS = new HashMap() ;
            for( int i = 0 ; i < s.length() ; i++ ){
                char c = s.charAt(i) ;
                mapS.put( c , mapS.getOrDefault(c , 0) + 1 ) ;
            }

            Map<Character , Integer> mapT = new HashMap() ;
            for( int i = 0 ; i < t.length() ; i++ ){
                char c = t.charAt(i) ;
                mapT.put( c , mapT.getOrDefault(c , 0) + 1 ) ;
            }

            for( char c : mapS.keySet() ){
                if(  (mapS.getOrDefault(c , 0).intValue() != mapT.getOrDefault(c ,0).intValue()) ){
                    return false ;
                }
            }
            return true ;
        }
    }
}
