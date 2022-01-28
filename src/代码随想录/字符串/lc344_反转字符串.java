package 代码随想录.字符串;

/**
 * @author pumpkin
 * @date 2022/1/17 0017 下午 14:36
 */
public class lc344_反转字符串 {
    class Solution {
        public void reverseString(char[] s) {
            int left = 0 ;
            int right = s.length - 1 ;
            while( left < right ){
                char temp = s[left] ;
                s[left++] = s[right];
                s[right--] = temp ;
            }
        }
    }
}
