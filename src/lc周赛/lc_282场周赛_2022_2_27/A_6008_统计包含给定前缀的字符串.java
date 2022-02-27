package lc周赛.lc_282场周赛_2022_2_27;

import java.util.HashMap;

/**
 * @author pumpkin
 * @date 2022/2/27
 */
public class A_6008_统计包含给定前缀的字符串 {
    class Solution {
        public int prefixCount(String[] words, String pref) {
            int count = 0 ;
            int prefLength = pref.length() ;
            for( String word : words ){
                if( word.length() < prefLength ){
                    continue ;
                }
                String preWord = word.substring(0 , prefLength) ;
                if( preWord.equals(pref) ){
                    count++ ;
                }
            }
            return count ;
        }
    }
}
