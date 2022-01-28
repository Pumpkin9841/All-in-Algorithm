package 代码随想录.哈希;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pumpkin
 * @date 2022/1/14 0014 下午 16:24
 */
public class lc438_找到字符串中所有字母异位词 {
    class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            int pLen = p.length() ;
            List<Integer> ans = new ArrayList() ;
            for( int i = 0 ; i <= s.length() - pLen ; i++ ){
                String temp = s.substring(i , i+pLen) ;
                if( isWord( temp , p) ){
                    ans.add(i) ;
                }
            }
            return ans ;
        }

        public boolean isWord(String s , String t){
            int[] record = new int[26] ;
            for( int i = 0 ; i < s.length() ; i++ ){
                record[s.charAt(i) - 'a']++ ;
            }
            for( int i = 0 ; i < t.length() ; i++ ){
                record[t.charAt(i) - 'a']-- ;
            }
            for( int i : record ){
                if( i != 0 ){
                    return false ;
                }
            }
            return true ;
        }
    }
}
