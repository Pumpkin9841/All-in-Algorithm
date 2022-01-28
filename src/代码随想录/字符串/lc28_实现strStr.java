package 代码随想录.字符串;

/**
 * @author pumpkin
 * @date 2022/1/19 0019 下午 13:16
 */
public class lc28_实现strStr {
    class Solution {
        public int strStr(String haystack, String needle) {
            if( "".equals(needle) ){
                return 0 ;
            }

            if( haystack.equals(needle) ){
                return 0 ;
            }

            int length = needle.length() ;
            char[] haystacks = haystack.toCharArray() ;
            for( int left = 0 ; left <= haystack.length()-length ; left++ ){
                int right = left + length ;
                if( haystack.substring(left , right).equals(needle) ){
                    return left ;
                }
            }
            return -1 ;
        }


    }
}
