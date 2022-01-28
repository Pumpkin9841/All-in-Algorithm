package lc周赛.lc_274周赛_2022_1_2;

/**
 * @author pumpkin
 * @date 2022/1/2 0002 上午 10:39
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 5967. 检查是否所有 A 都在 B 之前
 * 给你一个 仅 由字符 'a' 和 'b' 组成的字符串  s 。如果字符串中 每个 'a' 都出现在 每个 'b' 之前，返回 true ；否则，返回 false 。
 */
public class A_5967_检查是否所有A都在B之前 {
    class Solution {
        public boolean checkString(String s) {
            List<Character> list = new ArrayList() ;
            char[] temps = s.toCharArray() ;
            for( char c : temps ){
                list.add(c) ;
            }
            int firstB = list.indexOf('b') ;
            if( firstB < 0 ){
                return true ;
            }
            int lastA = list.lastIndexOf('a') ;
            return lastA < firstB ? true : false ;
        }
    }
}


