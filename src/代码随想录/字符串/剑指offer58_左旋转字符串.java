package 代码随想录.字符串;

/**
 * @author pumpkin
 * @date 2022/1/18 0018 下午 14:50
 */
public class 剑指offer58_左旋转字符串 {
    class Solution {
        public String reverseLeftWords(String s, int n) {
            int len=s.length();
            StringBuilder sb=new StringBuilder(s);
            reverseString(sb,0,n-1);
            reverseString(sb,n,len-1);
            return sb.reverse().toString();
        }
        public void reverseString(StringBuilder sb, int start, int end) {
            while (start < end) {
                char temp = sb.charAt(start);
                sb.setCharAt(start, sb.charAt(end));
                sb.setCharAt(end, temp);
                start++;
                end--;
            }
        }
    }
}
