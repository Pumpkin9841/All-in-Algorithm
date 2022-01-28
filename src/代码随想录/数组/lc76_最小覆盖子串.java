package 代码随想录.数组;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pumpkin
 * @date 2022/1/1 0001 下午 23:13
 */
public class lc76_最小覆盖子串 {
    class Solution {
        Map<Character , Integer> tMap = new HashMap() ; //记录t中的字符及个数
        Map<Character , Integer> currMap = new HashMap() ; //记录当前滑动窗口的字符和个数
        public String minWindow(String s, String t) {
            for( int i = 0 ; i < t.length() ; i++ ){
                char c = t.charAt(i) ;
                tMap.put( c , tMap.getOrDefault(c , 0) + 1 ) ;
            }

            int left = 0 ;
            int right = -1 ;
            int indexL = -1 ;
            int indexR = -1 ;
            int minLen = Integer.MAX_VALUE ;
            while( right < s.length() ){
                right++ ;
                if( right < s.length() && tMap.containsKey(s.charAt(right)) ){
                    currMap.put( s.charAt(right) , currMap.getOrDefault( s.charAt(right) , 0 ) + 1 ) ;
                }
                while( check() && left <= right ){
                    if( (right-left+1) < minLen ){
                        minLen = right-left+1 ;
                        indexL = left ;
                        indexR = right ;
                    }
                    //如果收缩滑动窗口时，丢掉的字符为t中字符，则将记录窗口中字符数的map中的该字符数量-1
                    if( tMap.containsKey( s.charAt(left) ) ){
                        currMap.put(s.charAt(left)  , currMap.getOrDefault(s.charAt(left)  , 0) -1 ) ;
                    }
                    left++ ;
                }
            }

            return indexL==-1? "" : s.substring(indexL ,indexR+1) ;
        }

        public boolean check(){
            for( char key : tMap.keySet() ){
                int value = tMap.get(key) ;
                if( currMap.getOrDefault(key , 0) < value ){
                    return false ;
                }
            }
            return true ;
        }
    }
}
