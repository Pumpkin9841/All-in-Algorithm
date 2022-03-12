package 剑指offer;

/**
 * @author pumpkin
 * @date 2022/3/12
 */
public class Offer05_替换空格 {
    class Solution {
        public String replaceSpace(String s) {
            char[] chars = s.toCharArray() ;
            StringBuilder sb = new StringBuilder() ;
            for( char c : chars ){
                if( c == ' ' ){
                    sb.append("%20") ;
                }
                else{
                    sb.append(c) ;
                }
            }
            return sb.toString() ;
        }
    }
}
