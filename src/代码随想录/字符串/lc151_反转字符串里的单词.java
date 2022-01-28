package 代码随想录.字符串;

import java.util.Arrays;

/**
 * @author pumpkin
 * @date 2022/1/18 0018 下午 13:58
 */
public class lc151_反转字符串里的单词 {
    class Solution {
        public String reverseWords(String s) {
            //出去开头和结尾的空格
            s = s.trim() ;
            String[] temp = s.split("\\s+") ;
            StringBuilder sb = new StringBuilder() ;
            for( int i = temp.length-1 ; i >= 0 ; i-- ){
                sb.append(temp[i]) ;
                if( i != 0){
                    sb.append(" ") ;
                }
            }
            return sb.toString() ;
        }
    }
}
