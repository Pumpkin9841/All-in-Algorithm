package 剑指offer;

/**
 * @author pumpkin
 * @date 2022/3/12
 */
public class Offer58_左旋转字符串 {
    class Solution {
        public String reverseLeftWords(String s, int n) {
            StringBuilder sb = new StringBuilder(s) ;
            reverseWord(sb , 0 , n-1) ;
            reverseWord(sb , n , s.length()-1) ;
            reverseWord(sb , 0 , s.length()-1) ;
            return sb.toString() ;
        }

        public void reverseWord(StringBuilder sb , int start , int end){
            while( start < end ){
                char temp = sb.charAt(start) ;
                sb.setCharAt(start , sb.charAt(end)) ;
                sb.setCharAt(end , temp) ;
                start++ ;
                end-- ;
            }
        }

    }
}
