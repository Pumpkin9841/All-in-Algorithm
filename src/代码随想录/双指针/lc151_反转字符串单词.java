package 代码随想录.双指针;

/**
 * @author pumpkin
 * @date 2022/1/21 0021 下午 16:04
 */
public class lc151_反转字符串单词 {
    class Solution {
        public String reverseWords(String s) {
            return reverseSingleWords(removeAllWords(removeCenterSpace(removeSpace(s)).toString())) ;
        }

        //去除头尾空格
        public String removeSpace(String s){
            int start = 0 ;
            int end = s.length() - 1 ;
            while( start <= end && s.charAt(start) == ' ' ){
                start++;
            }
            while( end >= start && s.charAt(end) == ' '){
                end--;
            }
            return s.substring(start , end+1) ;
        }

        //去除字符串中间多余空格
        public StringBuilder removeCenterSpace(String s){
            StringBuilder sb = new StringBuilder() ;
            char[] sc = s.toCharArray() ;
            for( int i = 0 ; i < sc.length ; i++ ){
                char c = sc[i] ;
                if( c != ' ' || sc[i-1] != ' ' ){
                    sb.append(c) ;
                }
            }
            return sb ;
        }

        //将字符串全部翻转
        public String removeAllWords(String s){
            char[] sc = s.toCharArray() ;
            int left = 0 ;
            int right = sc.length -1 ;
            while( left <= right ){
                char temp = sc[left] ;
                sc[left++] = sc[right] ;
                sc[right--] = temp ;
            }
            return String.valueOf(sc) ;
        }

        public String reverseSingleWords(String s){
            int left = 0 ;
            char[] sc = s.toCharArray() ;
            for( int i = 0 ; i < sc.length ; i++ ){
                if( sc[i] == ' ' || i == sc.length-1 ){
                    i = i==sc.length-1?sc.length:i ;
                    int right = i-1 ;
                    while( left <= right ){
                        char temp = sc[left] ;
                        sc[left++] = sc[right] ;
                        sc[right--] = temp ;
                    }
                    left = i+1 ;
                }
            }
            return String.valueOf(sc) ;
        }

    }
}
