package 代码随想录.字符串;

import java.util.ArrayList;

/**
 * @author pumpkin
 * @date 2022/1/17 0017 下午 14:41
 */
public class lc541_反转字符串Ⅱ {
    class Solution {
        public String reverseStr(String s, int k) {
            char[] charStr = s.toCharArray() ;
            int index = 0 ;
            int setp = 2*k ;
            int reverseStep = k - 1 ;
            while( index < s.length()-1 ){
                if( index + reverseStep < s.length()){
                    charStr = reverseHelp(charStr , index , index+reverseStep) ;
                }
                else {
                    charStr = reverseHelp(charStr , index , s.length()-1) ;
                }
                index = index + setp ;
            }
            return String.valueOf(charStr) ;
        }

        public char[] reverseHelp( char[] c , int startIndex , int endIndex){
            int left = startIndex ;
            int right = endIndex ;
            while( left < right ){
                char temp = c[left] ;
                c[left++] = c[right] ;
                c[right--] = temp ;
            }
            return c ;
        }
    }

}
