package 代码随想录.字符串;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pumpkin
 * @date 2022/1/17 0017 下午 15:07
 */
public class 剑指offer05_替换空格 {
    class Solution {
        public String replaceSpace(String s) {
            char[] c = s.toCharArray() ;
            List<Character> list = new ArrayList() ;
            for( char temp : c ){
                if( temp == ' '){
                    list.add('%') ;
                    list.add('2') ;
                    list.add('0') ;
                }
                else {
                    list.add(temp) ;
                }
            }

            char[] ans = new char[list.size()] ;
            int index = 0 ;
            for( char temp : list ){
                ans[index++] = temp ;
            }
            return String.valueOf(ans) ;
        }
    }
}
